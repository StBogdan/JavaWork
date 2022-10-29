package com.bogdan.utils;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.Parameter;

public class CliArgs {
    @Parameter
    public List<String> parameters = new ArrayList<>();

    @Parameter(names = { "--rawtitle", "-rt" }, description = "Number and title, as displayed on the problem's webpage")
    public String rawTitle;

    @Parameter(names = { "--fullurl", "-url" }, description = "Leetcode.com url of the problem")
    public String rawUrl;

    @Parameter(names = { "--title", "-t" }, description = "Title of the problem")
    public String title;


    @Parameter(names = { "--debug", "-d" }, description = "Debug mode")
    public boolean debug = false;
}