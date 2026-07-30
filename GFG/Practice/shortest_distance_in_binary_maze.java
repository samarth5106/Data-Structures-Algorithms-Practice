class Pair{
    int first;
    int r;
    int c;
    Pair pr;
    
    Pair(int first,Pair pr){
        this.first=first;
        this.pr=pr;
    }
    Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}

class Solution {
    public int shortestPath(int[][] mat, int[] src, int[] dest) {
        // code here
        //0 = no edge 
        // 1= edge 
     if (mat[src[0]][src[1]] == 0 || mat[dest[0]][dest[1]] == 0) {
            return -1;
        }
        //0 based nodes
        int dist_mat[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(dist_mat[i],(int)1e9);
        }
        
        dist_mat[src[0]][src[1]]=0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.first, b.first));
        
        Pair strt=new Pair(0,new Pair(src[0],src[1]));
        
        pq.add(strt);
        
        int cr[]={-1,0,1,0};
        int cc[]={0,1,0,-1};
        
        while(!pq.isEmpty()){
            
            Pair removed=pq.remove();
            
            int cost=removed.first;
            
            Pair cell=removed.pr;
            
            for(int i=0;i<4;i++){
                int nr=cell.r+cr[i];
                int nc=cell.c+cc[i];
                if(nr>=0&&nr<mat.length&&nc>=0&&nc<mat[0].length&&mat[nr][nc]==1&&dist_mat[nr][nc]>1+cost){
                    dist_mat[nr][nc]=1+cost;
                   pq.add(new Pair(dist_mat[nr][nc], new Pair(nr, nc)));
                }
            }
            
        }
        
        if(dist_mat[dest[0]][dest[1]]==(int)(1e9) )return -1;
        return dist_mat[dest[0]][dest[1]];
    }
}
