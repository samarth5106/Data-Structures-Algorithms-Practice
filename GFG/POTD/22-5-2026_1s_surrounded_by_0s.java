class Solution {

    boolean[][] visited;

    int[] dr={-1,1,0,0};
    int[] dc={0,0,-1,1};

    void dfs(int[][] grid,int r,int c){

        visited[r][c]=true;

        for(int k=0;k<4;k++){

            int nr=r+dr[k];
            int nc=c+dc[k];

            if(nr>=0&&nr<grid.length&&
               nc>=0&&nc<grid[0].length&&
               grid[nr][nc]==1&&
               !visited[nr][nc]){

                dfs(grid,nr,nc);
            }
        }
    }

    int cntOnes(int[][] grid){

        int cnt=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) cnt++;
            }
        }

        visited=new boolean[grid.length][grid[0].length];

        int top=0;
        int bottom=grid.length-1;
        int left=0;
        int right=grid[0].length-1;

        for(int i=left;i<=right;i++){

            if(grid[top][i]==1&&!visited[top][i]){
                dfs(grid,top,i);
            }
        }

        for(int i=top;i<=bottom;i++){

            if(grid[i][right]==1&&!visited[i][right]){
                dfs(grid,i,right);
            }
        }

        for(int i=left;i<=right;i++){

            if(grid[bottom][i]==1&&!visited[bottom][i]){
                dfs(grid,bottom,i);
            }
        }

        for(int i=top;i<=bottom;i++){

            if(grid[i][left]==1&&!visited[i][left]){
                dfs(grid,i,left);
            }
        }

        int tominus=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]) tominus++;
            }
        }

        return cnt-tominus;
    }
}
