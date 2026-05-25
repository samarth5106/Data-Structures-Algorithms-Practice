class Solution {
    public int climbStairs(int n, int[] cost) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int one=cost[i-1]+1+dp[i-1];
            int two=1000000;
            if(i>1)
             two=cost[i-1]+4+dp[i-2];
            int three=1000000;
            if(i>2)
             three=cost[i-1]+9+dp[i-3];
             dp[i]=Math.min(one,Math.min(two,three));

        }
        return dp[n];
    }
}
