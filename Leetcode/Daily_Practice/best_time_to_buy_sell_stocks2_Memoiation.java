class Solution {
   // int maxi=0;
     int solve(int i,int buy,int[] prices,int[][] dp){
            //buy =0 means cant buy
        //  buy 1 means can buy
        if(i>=prices.length) return 0;
        int profit=0;
       if(dp[i][buy]!=-1) return dp[i][buy];
        if(buy==1){
           profit=Math.max(-prices[i]+solve(i+1,0,prices,dp),0+solve(i+1,1,prices,dp));
        }
        else{
           profit=Math.max(prices[i]+solve(i+1,1,prices,dp),0+solve(i+1,0,prices,dp));
        }
        return dp[i][buy]=profit;

     }

    public int maxProfit(int[] prices) {
        //buy only when u haved sold previous all
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            Arrays.fill(dp[i],-1);
        }
    int maxi=solve( 0,1,prices,dp);
    
        return maxi;
    }
}
