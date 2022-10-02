package com.bogdan.utils;


import okhttp3.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;


import java.io.IOException;
import java.util.Map;

// See https://www.cnblogs.com/ZhaoxiCheung/p/9333476.html

public class GraphQLClient {
    private static String questionUrl = "https://leetcode.com/problems";
    private static String graphqlUrl = "https://leetcode.com/graphql";

    public static String getProblemDetailsJsonRaw(String problemNameOrUrl) throws IOException {
        String questionDescriptionURL;
        String problemName;
        if (problemNameOrUrl.contains("leetcode.com")) {
            questionDescriptionURL = problemNameOrUrl;
            problemName = problemNameOrUrl.split("/")[4];

            if (!problemNameOrUrl.endsWith("description/")) {
                if (!problemNameOrUrl.endsWith("/")) {
                    questionDescriptionURL = questionDescriptionURL + "/";
                }
                questionDescriptionURL = questionDescriptionURL + "description/";
            }
        } else { // Assume it's just the question name
            questionDescriptionURL = questionUrl + "/" + problemNameOrUrl + "/description/";
            problemName = problemNameOrUrl;
        }

        Connection.Response soupResponse =
                Jsoup.connect(questionDescriptionURL).method(Connection.Method.GET).execute();

        String csrftoken = soupResponse.cookie("csrftoken");
        String __cfduid = soupResponse.cookie("__cfduid");

        OkHttpClient client =
                new OkHttpClient.Builder().followRedirects(false).followSslRedirects(false).build();

        String postBody = "query{\n" + "  question(titleSlug:\"" + problemName + "\") {\n"
                + "    content\n  titleSlug\n    title\n  isPaidOnly\n    difficulty\n questionId\n"
                + "  }\n" + "}\n";

        System.out.println("Looking at executing query: ");
        System.out.println(postBody);


        RequestBody requestBody =
                RequestBody.create(postBody, MediaType.parse("application/graphql; charset=utf-8"));
        String cookiesString = "__cfduid=" + __cfduid + ";" + "csrftoken=" + csrftoken;

        Request request = new Request.Builder().addHeader("Content-Type", "application/graphql")
                .addHeader("Referer", questionUrl).addHeader("Cookie", cookiesString)
                .addHeader("x-csrftoken", csrftoken).url(graphqlUrl).post(requestBody).build();

        Response response1 = client.newCall(request).execute();
        String rawResponseString = response1.body().string();
        return rawResponseString;
    }

    public static LeetcodeProblem convertIntoLeetCodeProblem(String rawLeetcodeJsonResponse) {
        System.out.println("Raw returned response: ");
        System.out.println(rawLeetcodeJsonResponse);

        var parsedResponse = new com.google.gson.Gson().fromJson(rawLeetcodeJsonResponse,
                LeetCodeResponse.class);

        QuestionData question = parsedResponse.data.question;

        return new LeetcodeProblem(question.title, Integer.toString(question.questionId),
                questionUrl + "/" + question.titleSlug, question.difficulty);
    }

    public static void main(String... args) throws IOException {
        var rawJson =
                getProblemDetailsJsonRaw("https://leetcode.com/problems/restore-ip-addresses");

        System.out.println("Raw returned response: ");
        System.out.println(rawJson);

        var lc = convertIntoLeetCodeProblem(rawJson);

        System.out.println("Parse response content:");
        System.out.println(lc.buildHeaderComment());
    }
}
