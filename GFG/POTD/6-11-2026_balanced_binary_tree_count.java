class Solution {
    public int countBT(int h) {
        long MOD = 1000000007;

        if (h == 0 || h == 1) return 1;

        long[] dp = new long[h + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= h; i++) {
            dp[i] = (dp[i - 1] * dp[i - 1] +
                     2 * dp[i - 1] * dp[i - 2]) % MOD;
        }

        return (int) dp[h];
    }
}
