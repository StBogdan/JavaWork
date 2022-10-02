package com.bogdan.utils;

public class LeetcodeProblem {
    String title;
    String number;
    String url;
    Difficulty difficulty;
    String method;
    String time_complexity;
    String space_complexity;
    String note;


    public LeetcodeProblem(String title, String number, String url, String difficulty) {
        this.title = title;
        this.number = number;
        this.url = url;
        System.out.println("Parsing " + difficulty + " as " + Difficulty.valueOf(difficulty).toString());
        this.difficulty = Difficulty.valueOf(difficulty);
    }

    public LeetcodeProblem(String title, String number, String url, Difficulty difficulty) {
        this.title = title;
        this.number = number;
        this.url = url;
        this.difficulty = difficulty;
    }


    public LeetcodeProblem(String title, String number, String url, Difficulty difficulty,
            String method, String time_complexity, String space_complexity, String note) {
        this(title, number, url, difficulty);
        this.time_complexity = time_complexity;
        this.space_complexity = space_complexity;
        this.note = note;
        this.method = method;
    }

    public String buildProblemTableLine() {
        String problemLink = String.format("[%s](%s)", this.title, this.url);
        return problemLink;
    }

    public String buildHeaderComment() {

        // Example format:
        // Name: Problem name
        // Link: https://leetcode.com/problems/problem-name
        // Method: Solving tidbit
        // Time: O(1)
        // Space: O(1)
        // Difficulty: чики-брики

        String template_string =
                "// Name: %s\n" + "// Link: %s\n"
                        + "// Method: %s\n" + "// Time: %s\n" + "// Space: %s\n"
                        + "// Difficulty: %s\n";
        return String.format(template_string, this.title, this.url, this.method,
                this.time_complexity, this.space_complexity, this.difficulty.toString());
    }


    @Override
    public String toString() {
        return "LeetcodeProblem [difficulty=" + difficulty + ", method=" + method + ", note=" + note
                + ", number=" + number + ", space_complexity=" + space_complexity
                + ", time_complexity=" + time_complexity + ", title=" + title + ", url=" + url
                + "]";
    }



}
