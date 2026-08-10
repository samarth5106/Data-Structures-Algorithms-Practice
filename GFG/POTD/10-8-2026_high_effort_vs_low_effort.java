class Solution {
    int solve(int i,int takeh,int[] h,int[] l,int[][] dp){
        
        if(i>=h.length) return 0;
        int sum_not_take=0;
        int sum_h=0;
        int sum_l=0;
        
        if(dp[i][takeh]!=-1) return dp[i][takeh];
        
        sum_not_take=solve(i+1,1,h,l,dp);
        
        if(takeh==1){
            sum_h=h[i]+solve(i+1,0,h,l,dp);
        }
        
        sum_l=l[i]+solve(i+1,0,h,l,dp);
        
        return dp[i][takeh]=Math.max(sum_not_take,Math.max(sum_h,sum_l));
    }
    public int maxTask(int[] h, int[] l) {
        // code here
        int[][] dp=new int[h.length][2];
        
        for(int i=0;i<h.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        int ans=solve(0,1,h,l,dp);
        
        return ans;
    }
}
