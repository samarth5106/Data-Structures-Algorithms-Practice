import java.util.*;

class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // Style A: Strictly exact same size as grid
        int[][] dp=new int[n][m]; 
        
        // Base case: Starting cell sum is just the cell value
        dp[0][0]=grid[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0&&j==0)continue;
                
                int up=Integer.MAX_VALUE;
                if(i>0){
                    up=grid[i][j]+dp[i-1][j];
                }
                
                int left=Integer.MAX_VALUE;
                if(j>0){
                    left=grid[i][j]+dp[i][j-1];
                }
                
                dp[i][j]=Math.min(up,left);
            }
        }
        // Correct return position for Style A
        return dp[n-1][m-1]; 
    }
}
