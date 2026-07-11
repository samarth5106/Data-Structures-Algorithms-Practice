class Pair{
    int r;
    int c;
    int time;
    Pair cell;
    Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
    Pair(Pair cell,int time){
        this.cell=cell;
        this.time=time;
    }
}

class Solution {

    public int[][] updateMatrix(int[][] mat) {
        int[][] visited=new int[mat.length][mat[0].length];
        int[][] dist=new int[mat.length][mat[0].length];
        Queue<Pair> q=new LinkedList<>();
       // {{i,j},time}
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    visited[i][j]=1;
                    
                    Pair position= new Pair(i,j);
                    q.add(new Pair(position,0));
                }
            }
        }
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        while(!q.isEmpty()){
            Pair pr=q.remove();
            int row=pr.cell.r;
            int col=pr.cell.c;
            int time=pr.time;
            dist[row][col]=time;
            //pr ke 4 directions ke neighbours ko mark visited, add in queue and take care of time;
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0&&nrow<mat.length&&ncol>=0&&ncol<mat[0].length&&visited[nrow][ncol]==0){
                    visited[nrow][ncol]=1;
                    Pair position=new Pair(nrow,ncol);

                    q.add(new Pair(position,time+1));
                }
            }

        }
        return dist;
    }
}
