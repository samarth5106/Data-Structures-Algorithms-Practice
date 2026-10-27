class Solution {
    public int getMaxWeight(String s) {
        int n = s.length();
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            char c1 = s.charAt(i - 2);
            char c2 = s.charAt(i - 1);

            int pairWeight = (c1 != c2) ? 4 : 3;
            dp[i] = Math.max(dp[i], dp[i - 2] + pairWeight);
        }

        return dp[n];
    }
}
