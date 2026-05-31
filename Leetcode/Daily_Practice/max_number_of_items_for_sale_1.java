class Solution {

    int solve(int[][] items,int budget,int[][] dp,int[] bonuses,int itx,int mini){
        if (itx < 0) {
            return budget / mini;
        }
        if(dp[itx][budget]!=-1) return dp[itx][budget];

        int pick=0;
        if(budget>=items[itx][1])pick=bonuses[itx]+solve(items,budget-items[itx][1],dp,bonuses,itx-1,mini);
        int notpick=solve(items,budget,dp,bonuses,itx-1,mini);

        dp[itx][budget]=Math.max(pick,notpick);
        return dp[itx][budget];


    }
    public int maximumSaleItems(int[][] items, int budget) {
        int mini=Integer.MAX_VALUE;
        int bonuses[]=new int[items.length];
        for(int i=0;i<items.length;i++){
            int cnt=0;
            mini=Math.min(mini,items[i][1]);
            for(int j =0;j<items.length;j++){
                if(items[j][0]%items[i][0]==0){
                    cnt++;
                }
            }
            bonuses[i]=cnt;
        }
        int[][] dp=new int[items.length][budget+1];
        for(int i=0;i<items.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(items,budget,dp,bonuses,items.length-1,mini);
    }
}
