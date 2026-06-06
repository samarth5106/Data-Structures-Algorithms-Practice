class Solution {
    int solve(int i,int j,int[][] grid,int[][] dp){
        if(i==0&&j==0) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];

        int up=Integer.MAX_VALUE;
        if(i>0){
            up=grid[i][j]+solve(i-1,j,grid,dp);
        }
        int left=Integer.MAX_VALUE;
        if(j>0){
            left=grid[i][j]+solve(i,j-1,grid,dp);
        }
        
        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(grid.length-1,grid[0].length-1,grid,dp);
    }
}
