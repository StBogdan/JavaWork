package com.bogdan.utils;

public class QuestionData {
    String content;
    String titleSlug;
    String title;
    Boolean isPaidOnly;
    String difficulty;
    Integer questionId;
    @Override
    public String toString() {
        return "QuestionData [content(len)=" + content.length() + ", difficulty=" + difficulty + ", isPaidOnly="
                + isPaidOnly + ", questionId=" + questionId + ", title=" + title + ", titleSlug="
                + titleSlug + "]";
    }
}
