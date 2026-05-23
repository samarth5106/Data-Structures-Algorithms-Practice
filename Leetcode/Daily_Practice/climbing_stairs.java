class Solution {

    int solve(int n,int dp[]){
        if(n==0) return 1;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];

        int byone=solve(n-1,dp);
        
        int  bytwo=solve(n-2,dp);
        return dp[n]=byone+bytwo;
    }

    public int climbStairs(int n) {
        //int byone=0,bytwo=0;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}
