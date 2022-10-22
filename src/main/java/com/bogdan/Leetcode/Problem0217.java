package com.bogdan.Leetcode;

import java.util.HashSet;

public class Problem0217 {
    public boolean containsDuplicate(int[] nums) {
        var inArray = new HashSet<Integer>();
        for (var elem : nums) {
            if (inArray.contains(elem))
                return true;
            else
                inArray.add(elem);
        }
        return false;
    }
}
