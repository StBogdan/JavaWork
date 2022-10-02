package com.bogdan.Leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem1155Test {

    @Test
    public void example1() {
        var sol = new Problem1155();
        int n = 1;
        int k = 6;
        int t = 3;
        assertEquals(1, sol.numRollsToTarget(n, k, t));
    }

    @Test
    public void example2() {
        var sol = new Problem1155();
        int n = 2;
        int k = 6;
        int t = 7;
        assertEquals(6, sol.numRollsToTarget(n, k, t));
    }

    @Test
    public void example3() {
        var sol = new Problem1155();
        int n = 30;
        int k = 30;
        int t = 500;
        assertEquals(222616187, sol.numRollsToTarget(n, k, t));
    }

    @Test
    public void targetTooHigh() {
        var sol = new Problem1155();
        int n = 20, k = 1, t = 99999;
        assertEquals(0, sol.numRollsToTarget(n, k, t));
    }

    @Test
    public void targetTooLow() {
        var sol = new Problem1155();
        int n = 10, k = 10, t = 5;
        assertEquals(0, sol.numRollsToTarget(n, k, t));
    }
}
