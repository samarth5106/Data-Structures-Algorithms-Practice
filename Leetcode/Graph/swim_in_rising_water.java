class tuple{
    int r;
    int c;
    int val;
    tuple(int val,int r,int c){
        this.r=r;
        this.c=c;
        this.val=val;
    }
}

class Solution {
    public int swimInWater(int[][] grid) {
        //src = 0,0
        //dest = n-1. n-1
        //src se dest jane ke way ka min(max value) is our answer
        int[][] visited=new int[grid.length][grid.length];
        int n=grid.length;
        int mini=grid[n-1][n-1];
        PriorityQueue<tuple> pq=new PriorityQueue<>((x,y)->Integer.compare(x.val,y.val));

        pq.add(new tuple(grid[0][0],0,0));
        int[][] dist=new int[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }

        dist[0][0]=grid[0][0];

        
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        while(!pq.isEmpty()){
            tuple tp=pq.remove();
            int val=tp.val;
            int r=tp.r;
            int c=tp.c;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nc>=0&&nr<n&&nc<n&&visited[nr][nc]==0){
                    if(dist[nr][nc]>Math.max(val,grid[nr][nc])){
                        dist[nr][nc]=Math.max(val,grid[nr][nc]);
                        pq.add(new tuple(dist[nr][nc],nr,nc));
                        visited[nr][nc]=1;
                    }
                }
            }

        }
        return dist[n-1][n-1];

    }
}
