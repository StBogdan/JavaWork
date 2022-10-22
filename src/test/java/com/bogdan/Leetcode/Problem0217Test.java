package com.bogdan.Leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Problem0217Test {

    @Test
    public void example1() {
        int[] nums = {1, 2, 3, 1};
        var sol = new Problem0217();


        assertTrue(sol.containsDuplicate(nums));
    }

    @Test
    public void example2() {
        int[] nums = {1, 2, 3, 4};
        var sol = new Problem0217();

        assertFalse(sol.containsDuplicate(nums));
    }

    @Test
    public void example3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        var sol = new Problem0217();

        assertTrue(sol.containsDuplicate(nums));
    }

    @Test
    public void emptyArray() {
        int[] nums = {};
        var sol = new Problem0217();

        assertFalse(sol.containsDuplicate(nums));
    }

    @Test
    public void oopsAllOnes() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        var sol = new Problem0217();

        assertTrue(sol.containsDuplicate(nums));
    }


}
