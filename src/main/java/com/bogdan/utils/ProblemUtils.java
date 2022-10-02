package com.bogdan.utils;

public class ProblemUtils {

    public static void main(String[] args) {

        var exampleProblem = new LeetcodeProblem("title", "number", "url", Difficulty.Easy,
                "method", "time_complexity", "space_complexity", "note");
        System.out.println("Example markdown line table for " + exampleProblem);
        System.out.println(exampleProblem.buildProblemTableLine());

        System.out.println("\nExample file header:");
        System.out.println(exampleProblem.buildHeaderComment());
    }

}
