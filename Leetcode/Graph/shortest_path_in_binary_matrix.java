class tuple{
    int wt;
    int row;
    int col;
    tuple(int wt,int row,int col){
        this.wt=wt;
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
      
       // int n=0;
       if(grid[0][0]==1||grid[grid.length-1][grid.length-1]==1) return -1;
       // ArrayList<ArrayList<pair>> adj=new ArrayList<>();

        int dist[][]=new int[grid.length][grid.length];

       for(int i=0;i<grid.length;i++){
        Arrays.fill(dist[i],Integer.MAX_VALUE);
       }

        dist[0][0]=1;

        PriorityQueue<tuple> pq=new PriorityQueue<tuple>((x,y)->x.wt-y.wt);
        pq.add(new tuple(1,0,0));
        int dr[]={-1,-1,0,1,1,1,0,-1};
        int dc[]={0,1,1,1,0,-1,-1,-1};
        while(!pq.isEmpty()){
            tuple tp=pq.remove();
            int wt=tp.wt;
            int r=tp.row;
            int c=tp.col;
            for(int i=0;i<8;i++){
                int nrow=r+dr[i];
                int ncol=c+dc[i];
                if(nrow>=0&&nrow<grid.length&&ncol>=0&&ncol<grid.length&&grid[nrow][ncol]==0){
                    //if node is adjacent
                    if(dist[nrow][ncol]>wt+1){
                        dist[nrow][ncol]=wt+1;
                        pq.add(new tuple(dist[nrow][ncol],nrow,ncol));
                    }
                }
            }
        }
        if(dist[grid.length-1][grid.length-1]==Integer.MAX_VALUE) return -1;
        return  dist[grid.length-1][grid.length-1];


    }
}
