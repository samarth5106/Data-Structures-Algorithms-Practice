
class Solution {

    int solve(int i,int j,int[][] grid,int xor,int[][][] dp){

        if(i==grid.length-1&&j==grid[0].length-1){
            return xor^grid[i][j];
        }

        if(i>=grid.length||j>=grid[0].length) return (int)1e8;
         if(dp[i][j][xor]!=-1) return dp[i][j][xor];

        int right=solve(i,j+1,grid,xor^grid[i][j],dp);
        int down=solve(i+1,j,grid,xor^grid[i][j],dp);
    
        return dp[i][j][xor]=Math.min(right,down);


    }


    public int minCost(int[][] grid) {
        int ans=0;
        int[][][] dp=new int[grid.length][grid[0].length][1024];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 Arrays.fill(dp[i][j],-1);
            }
        }

        ans=solve(0,0,grid,0,dp);
        return ans;
    }
}
