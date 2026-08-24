import java.util.Arrays;

class Solution {

    int solve( int ones, int zeroes, int len, int[][] dp) {

        // Base case: Jab puri string build ho gayi
        if (ones+zeroes == len) {
            return (ones == len / 2 && zeroes == len / 2) ? 1 : 0;
        }

        if (dp[ones][zeroes] != -1) return dp[ones][zeroes];

        int append_1 = 0;
        int append_0 = 0;

        // Choice 1: '1' append karein (jab tak ones limit se kam ho)
        if (ones < len / 2) {
            append_1 = solve( ones + 1, zeroes, len, dp);
        }

        // Choice 2: '0' tabhi append karein jab zeroes < ones (Valid Prefix Constraint!)
        if (zeroes < ones && zeroes < len / 2) {
            append_0 = solve( ones, zeroes + 1, len, dp);
        }

        return dp[ones][zeroes] = (int) (((long) append_1 + append_0) % 1_000_000_007);
    }

    public int prefixStrings(int n) {
        
        int[][] dp = new int[n + 1][n + 1];
        
       
            
            for (int j = 0; j <= n; j++) {
                Arrays.fill(dp[j], -1);
            }
            
        

        return solve(0, 0, 2 * n, dp);
    }
}
