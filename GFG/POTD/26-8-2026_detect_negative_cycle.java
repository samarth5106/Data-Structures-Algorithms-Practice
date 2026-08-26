class Solution {
    public boolean isNegativeWeightCycle(int V, int[][] edges) {
        // code here
        int dist[]=new int[V];
        
        //Arrays.fill(dist,(int)1e9);
        
        for(int i=0;i<V-1;i++){
            
            for(int[] it:edges){
                int u=it[0];
                int v=it[1];
                int wt=it[2];
                
                if(dist[u]!=(int)1e9&&dist[v]>dist[u]+wt){
                    dist[v]=dist[u]+wt;
                }
                
            }
        }
        
        for(int[] it:edges){
            
            int u=it[0];
                int v=it[1];
                int wt=it[2];
                if(dist[v]>dist[u]+wt){
                    return true;
                }
        }
        return false;
        
    }
}
