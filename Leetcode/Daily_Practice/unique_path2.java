class Solution {
    int solve(int i,int j, int[][] mat,int[][] dp){
        if(i==0&&j==0&&mat[i][j]!=1) return 1;
        //left and up
        if(mat[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=0,left=0;
        if(i>0)  up=solve(i-1,j,mat,dp);
        if(j>0) left=solve(i,j-1,mat,dp);
        return dp[i][j]=up+left;
    }

    public int uniquePathsWithObstacles(int[][] mat) {
        //recusion from m-1,n-1 to 0,0
        int[][] dp=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        int i=mat.length-1;
        int j=mat[0].length-1;
        int cnt=solve(i,j,mat,dp);
        return cnt;
    }
}
