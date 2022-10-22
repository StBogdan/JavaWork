package com.bogdan.Leetcode;

import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class Problem0049Test {
    // TODO: Put everything in a set
    // These tests is brittle due to ordering of elements being compared

    @Test
    public void manualExample() {
        String[] anagramWords = {"aaa", "bbb", "ccc", "aba", "baa"};
        var sol = new Problem0049();
        List<List<String>> want = new ArrayList<List<String>>();
        want.add(Arrays.asList("aaa"));
        want.add(Arrays.asList("bbb"));
        want.add(Arrays.asList("ccc"));
        want.add(Arrays.asList("aba", "baa"));

        var got = sol.groupAnagrams(anagramWords);

        assertTrue(want.size() == got.size() && want.containsAll(got) && got.containsAll(want));

    }


    @Test
    public void example1() {
        String[] anagramWords = {"eat", "tea", "tan", "ate", "nat", "bat"};
        var sol = new Problem0049();
        List<List<String>> want = new ArrayList<List<String>>();

        want.add(Arrays.asList("eat", "tea", "ate"));
        want.add(Arrays.asList("bat"));
        want.add(Arrays.asList("tan", "nat"));

        var got = sol.groupAnagrams(anagramWords);

        // System.err.printf("Got %s, wanted %s\n", got, want);
        assertTrue(want.size() == got.size());
        assertTrue(got.containsAll(want));
        assertTrue(want.containsAll(got));

    }
}
