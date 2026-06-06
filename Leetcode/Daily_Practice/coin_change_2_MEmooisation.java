class Solution {

    int solve(int idx,int[] coins,int amt,int[][] dp){
        if(idx==0){
            if(amt%coins[0]==0) return 1;
            return 0;
        }
        if(dp[idx][amt]!=-1) return dp[idx][amt];
        int notpick=solve(idx-1,coins,amt,dp);
        int pick=0;
        if(amt>=coins[idx]){
            pick=solve(idx,coins,amt-coins[idx],dp);
        }
        return dp[idx][amt]=pick+notpick;
    }
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(coins.length-1,coins,amount,dp);
        return ans;
    }
}
