class Solution {
    int solve(int i,int j,int[][] mat,int xd,int yd,int[][] visited){
        
        if(i==xd&&j==yd){
            return 0;
        }
         if(i<0||j<0||i>=mat.length||j>=mat[0].length) return -1000000;
        if(mat[i][j]==0||visited[i][j]==1) return -1000000;
       
       
        visited[i][j]=1;
        
        int north=1+solve(i-1,j,mat,xd,yd,visited);
        int east=1+solve(i,j+1,mat,xd,yd,visited);
         int south=1+solve(i+1,j,mat,xd,yd,visited);
        int west=1+solve(i,j-1,mat,xd,yd,visited);
        visited[i][j]=0;
        
        return Math.max(north,Math.max(east,Math.max(west,south)));
       
        
    }
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        // code here
        if(mat[xd][yd]==0) return -1;
         int[][] visited=new int[mat.length][mat[0].length];
        int ans=solve(xs,ys,mat,xd,yd, visited);
        if(ans<0) return -1;
        return ans;
        
    }
}
