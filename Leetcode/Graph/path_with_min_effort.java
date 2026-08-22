class tuple{

    int r;
    int c;
    int wt;
    tuple(int cst,int rw,int cl){
        wt=cst;
        r=rw;
        c=cl;
    }
}


class Solution {
    public int minimumEffortPath(int[][] heights) {
        //min(poore path ke conssecutive cells ka abs differences ka max)
        int n=heights.length;
        int m=heights[0].length;
    
        int[][] dist=new int[n][m];
        
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dist[0][0]=0;

        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        PriorityQueue<tuple> pq=new PriorityQueue<>((x,y)->Integer.compare(x.wt,y.wt));

        pq.add(new tuple(0,0,0));

        while(!pq.isEmpty()){
            tuple tp=pq.remove();
            int r=tp.r;
            int col=tp.c;
            int cost=tp.wt;
            for(int t=0;t<4;t++){

                int nr=r+dr[t];
                int nc=col+dc[t];
                
                if(nr>=0&&nr<heights.length&&nc>=0&&nc<heights[0].length){

                    int diff=Math.abs(heights[r][col]-heights[nr][nc]);
                    if(dist[nr][nc]>Math.max(cost,diff)){

                        dist[nr][nc]=Math.max(cost,diff);

                        pq.add(new tuple(dist[nr][nc],nr,nc));
                    }
                   
                }
             }
            
        }
        return dist[n-1][m-1];

       

    }
}
