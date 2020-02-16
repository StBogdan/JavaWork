package LeetCode;

import java.io.*;

public class Problem1051 {

    public int maxProfit(int[] prices) {
        int cmax = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int cmin = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - cmin > cmax) {
                    cmax = prices[j] - cmin;
                }
            }
        }
        return cmax;
    }


    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] prices = stringToIntegerArray(line);

            int ret = new Problem1051().maxProfit(prices);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
