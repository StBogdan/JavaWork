package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Float> intset = new HashSet<>();
        for (int x : arr) {
            float elem = (float) x;
            if (intset.contains(elem / 2) || intset.contains(elem * 2)) {
                return true;
            } else {
                intset.add(elem);
            }
        }
        return false;
    }
}
