class Solution {
    int solve(int[][] mat, int row, int prevc,int[][] dp){
        if(row==mat.length+1){
            return 0;
        }
        
        if(dp[row][prevc]!=-1) return dp[row][prevc];
        
        int maxVal=0;
        
        for(int j=1;j<=mat.length;j++){
            
            if(j!=prevc){
                int current=mat[row-1][j-1]+solve(mat,row+1,j,dp);
                maxVal=Math.max(maxVal,current);
            }
            
        }
        
        return dp[row][prevc]=maxVal;
    }
    public int zigzagSequence(int[][] mat){
        int dp[][]=new int[mat.length+1][mat.length+1];
        for(int i=0;i<=mat.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(mat,1,0,dp);
    }
}
