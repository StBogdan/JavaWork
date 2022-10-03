package com.bogdan.Leetcode;

public class Problem1578 {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int n = colors.length();
        if (n == 1) { // Cannot have 2 balloons of same colour if only 1 balloon
            return 0;
        }

        int prev_time_idx = -1;
        for (int i = 1; i < n; i++) {
            // If finding sames, keep track of the one we didn't yet take down
            // This is going to go towards the maximum of the sequence of same colour balloons
            if (colors.charAt(i - 1) == colors.charAt(i)) {
                int other_time;

                if (prev_time_idx == -1) {
                    other_time = neededTime[i - 1];
                    prev_time_idx = i - 1;
                } else {
                    other_time = neededTime[prev_time_idx];
                }

                if (other_time > neededTime[i]) {
                    totalTime += neededTime[i];
                } else {
                    totalTime += other_time;
                    prev_time_idx = i;
                }
            } else { // End of a streak of sames
                prev_time_idx = -1;
            }
        }
        return totalTime;
    }
}
