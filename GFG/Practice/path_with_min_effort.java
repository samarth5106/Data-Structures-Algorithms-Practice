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
    public int minCostPath(int[][] mat) {
        // code here
         int dist_mat[][]=new int[mat.length][mat[0].length];
         
        for(int i=0;i<mat.length;i++){
            Arrays.fill(dist_mat[i],(int)1e9);
        }
        
        dist_mat[0][0]=0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.first, b.first));
        
        Pair strt=new Pair(0,new Pair(0,0));
        
        pq.add(strt);
        
        int cr[]={-1,0,1,0};
        int cc[]={0,1,0,-1};
        
        while(!pq.isEmpty()){
            
            Pair removed=pq.remove();
            
            Pair cell=removed.pr;
            int diff=removed.first;
            for(int i=0;i<4;i++){
                int nr=cell.r+cr[i];
                int nc=cell.c+cc[i];
               
                if(nr>=0&&nr<mat.length&&nc>=0&&nc<mat[0].length){
                     int newdiff=Math.abs(mat[cell.r][cell.c]-mat[nr][nc]);
                int maxidiff=Math.max(newdiff,diff);
                if(dist_mat[nr][nc]>maxidiff){
                     dist_mat[nr][nc]=maxidiff;
                   pq.add(new Pair(dist_mat[nr][nc], new Pair(nr, nc)));
                }
                   
                }
            }
            
        }
        
        return dist_mat[mat.length-1][mat[0].length-1];
    }
}
