class Solution {

    public int maxProfit(int[] prices) {
        //buy only when u haved sold previous all
        int[][] dp=new int[prices.length+1][2];
        for(int i=0;i<2;i++){
            dp[prices.length][i]=0;
        }
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                int profit=0;
                if(j==1){
                    profit=Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
                }
                else{
                    profit=Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);
                }
                dp[i][j]=profit;
            }
        }
    int maxi=dp[0][1];
    
        return maxi;
    }
}
