class Solution {
    public int countSubsequences(String s, int n) {
        int MOD = 1000000007;
        int len = s.length();

        // dp[i][rem] stores the count of subsequences formed using a prefix of s
        // that result in a remainder 'rem' when divided by n
        int[][] dp = new int[len + 1][n];

        // Base state: 1 way to have remainder 0 before processing any digits (empty set)
        dp[0][0] = 1;

        for (int i = 0; i < len; i++) {
            int digit = s.charAt(i) - '0';
            for (int rem = 0; rem < n; rem++) {
                // 1. Skip current character
                dp[i + 1][rem] = (dp[i + 1][rem] + dp[i][rem]) % MOD;

                // 2. Take current character (update remainder)
                int nextRem = (rem * 10 + digit) % n;
                dp[i + 1][nextRem] = (dp[i + 1][nextRem] + dp[i][rem]) % MOD;
            }
        }

        // Subtract 1 to remove the empty subsequence (which accounts for remainder 0)
        return (dp[len][0] - 1 + MOD) % MOD;
    }
}
