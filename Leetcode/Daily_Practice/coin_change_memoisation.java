class Solution {

    int solve(int idx,int[] coins, int amt,int[][] dp){
        if(idx<0){ 
            if(amt!=0) return 1000000000;
           return 0;
        }

        if(dp[idx][amt]!=-1) return dp[idx][amt];
        int notpick=0+solve(idx-1,coins,amt,dp);
        int pick=Integer.MAX_VALUE;
        if(coins[idx]<=amt){
            pick=1+solve(idx,coins,amt-coins[idx],dp);
        }

        return dp[idx][amt]=Math.min(pick,notpick);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(coins.length-1,coins,amount,dp);
        if(ans>=1000000000) return -1;
        return ans;
    }
}
