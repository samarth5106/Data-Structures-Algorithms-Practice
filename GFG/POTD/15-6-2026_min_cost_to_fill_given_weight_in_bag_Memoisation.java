class Solution {
     int solve(int i,int w,int[] cost,int[][] dp){
      if(i<0&&w!=0){
          return 1000000;
      }
      if(w==0) return 0;
      if(dp[i][w]!=-1) return dp[i][w];
      int notpick=0+solve(i-1,w,cost,dp);
      int pick=1000000;
      if(i+1<=w&&cost[i]!=-1){
          pick=cost[i]+solve(i,w-(i+1),cost,dp);
      }
      return dp[i][w]=Math.min(pick,notpick);
      
  }
    int minimumCost(int[] cost, int w) {
        // code here
        int[][] dp=new int[cost.length][w+1];
        for(int i=0;i<cost.length;i++){
         Arrays.fill(dp[i],-1);   
        }
        int ans=solve(cost.length-1,w,cost,dp);
        if(ans>=1000000) return -1;
        return ans;
    }
}
