class Solution {

    public int uniquePathsWithObstacles(int[][] mat) {
        //recusion from m-1,n-1 to 0,0
        //got TLE
        //so Memoisation 
        int[][] dp=new int[mat.length][mat[0].length];
        if(mat[0][0]==1||mat[mat.length-1][mat[0].length-1]==1) return 0;
        //else return 0;
        //dp[0][0]=1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                

                if(i==0&&j==0) dp[0][0]=1;

                else if(mat[i][j]==1) dp[i][j]=0;
                else{
                int up=0,left=0;
                if(i>0) up=dp[i-1][j];
                if(j>0) left=dp[i][j-1];
                dp[i][j]=up+left;
                }
                
            }
        }
        return dp[mat.length-1][mat[0].length-1];
    }
}
