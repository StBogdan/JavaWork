package com.bogdan.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Take every word
        // Sort the letters (or make set of them), store that as anagram key
        // Add further words to the anagram key
        var wordMap = new HashMap<String, ArrayList<String>>();

        for (String word : strs) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String wordKey = new String(wordChars);


            if (!wordMap.containsKey(wordKey)) {
                wordMap.put(wordKey, new ArrayList<>());
            }

            wordMap.get(wordKey).add(word);
        }

        return new ArrayList<>(wordMap.values());
    }

    public static void main(String[] args) {
        var sol = new Problem0049();
        String[] anagrams = {"aaa", "bbb", "ccc", "aba", "baa"};
        System.out.println(sol.groupAnagrams(anagrams));
    }
}
