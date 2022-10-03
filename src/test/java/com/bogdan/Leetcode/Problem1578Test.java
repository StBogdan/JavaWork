package com.bogdan.Leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem1578Test {
    @Test
    public void basicTest1() {
        var sol = new Problem1578();
        String colors = "abaac";
        int[] times = new int[] {1, 2, 3, 4, 5};
        assertEquals(3, sol.minCost(colors, times));
    }

    @Test
    public void basicTest2() {
        var sol = new Problem1578();
        String colors = "abc";
        int[] times = new int[] {1, 2, 3};
        assertEquals(0, sol.minCost(colors, times));
    }

    @Test
    public void basicTest3() {
        var sol = new Problem1578();
        String colors = "aabaa";
        int[] times = new int[] {1, 2, 3, 4, 1};
        assertEquals(2, sol.minCost(colors, times));
    }

    @Test
    public void oneElement() {
        var sol = new Problem1578();
        String colors = "z";
        int[] times = new int[] {10};
        assertEquals(0, sol.minCost(colors, times));
    }

    @Test
    public void largeSimilarStrech() {
        var sol = new Problem1578();
        String colors = "zaaaaaz";
        int[] times = new int[] {10, 10, 20, 300, 40, 50, 10};
        assertEquals(120, sol.minCost(colors, times));
    }

    @Test
    public void submitTest1() {
        var sol = new Problem1578();
        String colors = "aaabbbabbbb";
        int[] times = new int[] {3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1};
        assertEquals(26, sol.minCost(colors, times));
    }

    @Test
    public void submitTest1Reduced() {
        var sol = new Problem1578();
        String colors = "bbbb";
        int[] times = new int[] {5, 4, 8, 1};
        assertEquals(10, sol.minCost(colors, times));
    }
}
