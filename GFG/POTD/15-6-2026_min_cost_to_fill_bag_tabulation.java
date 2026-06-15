class Solution {
    int minimumCost(int[] cost, int w) {
        // code here
        int[][] dp=new int[cost.length+1][w+1];
        for(int wt=1;wt<=w;wt++){
            dp[0][wt]=1000000;
        }
        for(int i=0;i<=cost.length;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=cost.length;i++){
            for(int wt=1;wt<=w;wt++){
                int notpick=0+dp[i-1][wt];
                int pick=1000000;
                if(cost[i-1]!=-1&&i<=wt){
                    pick=cost[i-1]+dp[i][wt-(i)];
                }
                dp[i][wt]=Math.min(pick,notpick);
            }
        }
        
        int ans=dp[cost.length][w];
        if(ans>=1000000) return -1;
        return ans;
    }
}
