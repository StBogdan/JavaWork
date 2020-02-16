package LeetCode;

public class MockTest1 {

    public boolean canWinNim(int n) {
        // Loser only if number of stones encountered is divisible by 4 (unless 0)
        return n % 4 != 0;
    }


    public int hammingDistance(int x, int y) {
        int hamDist = 0;
        while (x !=0 || y != 0){
            // Get last bits of both ints
            int cx = x & 1;
            int cy = y & 1;

            if (cx != cy)
                hamDist +=1;

            x >>= 1;
            y >>= 1;
        }
        return hamDist;
    }
}
