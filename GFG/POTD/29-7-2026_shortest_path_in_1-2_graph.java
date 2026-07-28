class Pair{
    int nd;
    int wt;
    Pair(int node, int wth){
        nd=node;
        wt=wth;
    }
}

class Solution {
    public int shortestPath(int V, int src, int dest, int[][] edges) {
        // code here
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            Pair pr=new Pair(v,wt);
            adj.get(u).add(pr);
            pr=new Pair(u,wt);
            adj.get(v).add(pr);
        }
        
       int dist[]=new int[V];
    Arrays.fill(dist,(int)1e9);
    dist[src]=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int nd=q.remove();
            for(int i=0;i<adj.get(nd).size();i++){
                Pair pr=adj.get(nd).get(i);
                int adjnode=pr.nd;
                int cost=pr.wt;
                if(dist[adjnode]>cost+dist[nd]){
                    dist[adjnode]=cost+dist[nd];
                    q.add(adjnode);
                }
            }
        }
        
        if(dist[dest]==(int)1e9) return -1;
        return dist[dest];
        
    }
}
