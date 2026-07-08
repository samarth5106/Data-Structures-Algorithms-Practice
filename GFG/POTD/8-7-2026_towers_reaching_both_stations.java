class Solution {
    public int countCoordinates(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        boolean[][] p = new boolean[n][m];
        boolean[][] q = new boolean[n][m];
        
        Queue<int[]> qp = new LinkedList<>();
        Queue<int[]> qq = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            p[i][0]=true; qp.add(new int[]{i,0});
        }
        for(int j=0;j<m;j++){
            p[0][j]=true; qp.add(new int[]{0,j});
        }
        for(int i=0;i<n;i++){
            q[i][m-1]=true; qq.add(new int[]{i,m-1});
        }
        for(int j=0;j<m;j++){
            q[n-1][j]=true; qq.add(new int[]{n-1,j});
        }
        
        bfs(mat,p,qp,n,m);
        bfs(mat,q,qq,n,m);
        
        int count=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(p[i][j]&&q[i][j])count++;
        
        return count;
    }
    
    private void bfs(int[][] mat, boolean[][] vis, Queue<int[]> queue, int n, int m){
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            int r=cur[0],c=cur[1];
            for(int d=0;d<4;d++){
                int nr=r+dx[d],nc=c+dy[d];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&!vis[nr][nc]&&mat[nr][nc]>=mat[r][c]){
                    vis[nr][nc]=true;
                    queue.add(new int[]{nr,nc});
                }
            }
        }
    }
}
