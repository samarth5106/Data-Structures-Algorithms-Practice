class Solution {
    public int minDays(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,(int)1e9);
        dp[0]=-1;
        for(int score=1;score<=n;score++){
            for(int len=1; ; len++){
                int points=len*(len+1)/2;
                if(points>score) break;
                dp[score]=Math.min(dp[score],dp[score-points]+len+1);
            }
        }
        return dp[n];
    }
}
