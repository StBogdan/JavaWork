package com.bogdan.utils;

import com.beust.jcommander.JCommander;

public class JavaWorkCLI {
    public static void main(String[] args) throws Exception {
        CliArgs cargs = new CliArgs();
        String[] argv = { "--fullurl", "https://leetcode.com/problems/zigzag-conversion" };
        JCommander.newBuilder()
                .addObject(cargs)
                .build()
                .parse(argv);

        System.out.printf("Started with other paramters: %s\n", cargs.parameters);

        if (cargs.rawUrl == null || cargs.rawUrl.isEmpty()) {
            System.out.println("JavaWorkCLI: Can only process full urls for now");
            return;
        }
        String headerString = GraphQLClient.getProblemHeaderString(
                GraphQLClient.convertIntoLeetCodeProblem(GraphQLClient.getProblemDetailsJsonRaw(cargs.rawUrl)));
        System.out.println("JavaWorkCLI.main()\n" + headerString);
    }
}
