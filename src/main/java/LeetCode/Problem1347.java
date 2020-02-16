package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem1347 {
    public int minSteps(String s, String t){
        Map<Character, Integer> counts1 = new HashMap<>();
        Map<Character, Integer> counts2 = new HashMap<>();


        for (char c : s.toCharArray()){
            counts1.merge(c, 1, Integer::sum);
        }
        for (char c: t.toCharArray()){
            counts2.merge(c, 1, Integer::sum);
        }

        int flips1 = 0;
        for (var pair : counts1.entrySet()){
            char k = pair.getKey();
            int v = pair.getValue();
            int contraCounts = counts2.getOrDefault(k, 0);
            if (contraCounts != v){
                flips1 += Math.abs(contraCounts - v);
            }
            counts2.remove(k);
        }

        int flips2 = counts2.values().stream().reduce(0, Integer::sum);
        return (flips2 + flips1) /2;
    }
}
