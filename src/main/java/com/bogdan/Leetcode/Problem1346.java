package com.bogdan.Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Float> intSet = new HashSet<>();
        for (int x : arr) {
            float elem = (float) x;
            if (intSet.contains(elem / 2) || intSet.contains(elem * 2)) {
                return true;
            } else {
                intSet.add(elem);
            }
        }
        return false;
    }
}
