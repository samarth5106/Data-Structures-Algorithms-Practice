class Solution {
    int solve(int i, int j,int[][] dp){
        if(i==0&&j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int left=0;
        if(i>0){
             left=solve(i-1,j,dp);
        }
        int up=0;
        if(j>0){
            up=solve(i,j-1,dp);
        }
        dp[i][j]=up+left;
        return up+left;
    }
    public int uniquePaths(int m, int n) {
        int i=m-1;
        int j=n-1;
        int[][] dp=new int[m][n];
        for(int I=0;I<m;I++){
            Arrays.fill(dp[I],-1);
        }
       // Arrays.fill(dp,-1);
        int cnt=solve(i,j,dp);
        return cnt;
    }
}
