package com.bogdan.Leetcode;

import java.util.HashMap;
import java.util.Map;

class Problem1155 {
    Map<String, Integer> memo = new HashMap<>();
    final private int MOD = ((int) Math.pow(10, 9) + 7);

    public int numRollsToTarget(int dice, int sides, int target) {
        String identity = String.format("%s-%s", dice, target);
        if (memo.containsKey(identity)) {
            return memo.get(identity);
        }

        int ways = 0;
        if (dice == 0) {
            ways = (target != 0) ? 0 : 1;

            memo.put(identity, ways);
            return (int) ways;
        }
        if (dice * sides < target) {
            memo.put(identity, 0);
            return 0;
        }

        for (int diceVal = 1; diceVal <= sides; diceVal++) {
            if (target - diceVal < 0) {
                break;
            }

            ways = (ways + this.numRollsToTarget(dice - 1, sides, target - diceVal)) % MOD;
        }

        // System.out.printf(".numRollsToTarget(%s, %s, %s) = %s\n", dice, sides, target, ways);
        memo.put(identity, ways);
        return ways;
    }

    public static void main(String[] args) {
        var sol = new Problem1155();
        int n = 30;
        int k = 30;
        int t = 500;
        long ans = sol.numRollsToTarget(n, k, t);
        System.out.printf("Result for n=%s, k=%s, target=%s is: %s", n, k, t, ans);
    }
}


