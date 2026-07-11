

class Solution {
    void dfs(int i,int j,char[][] grid,StringBuilder sb
    , int[][] visited,int r0,int c0){
    visited[i][j]=1;
   // Pair coord=new Pair(i-r0,j-c0);
   sb.append((i-r0)+","+(j-c0)+" ");
   
    int[] delrow={-1,0,1,0};
    int[] delcol={0,+1,0,-1};
    for(int k=0;k<4;k++){
        int nrow=i+delrow[k];
        int ncol=j+delcol[k];
        if(nrow>=0&&nrow<grid.length&&ncol>=0&&ncol<grid[0].length&&visited[nrow][ncol]==0&&grid[nrow][ncol]=='L'){
            dfs(nrow,ncol,grid,sb,visited,r0,c0);
        }
    }
    
}
    public int countDistinctIslands(char[][] grid) {
        // code here
        //hame set use krna hoga and then set ka size is answer
        // take care of maintaining same dfs order for each traversal;
        
        Set<String> st=new HashSet<>();
        
        int[][] visited=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='L'&&visited[i][j]==0){
                   
                  StringBuilder sb=new StringBuilder();
                    dfs(i,j,grid,sb,visited,i,j);
                    st.add(sb.toString());
                }
            }
        }
        return st.size();
    }
}
