class Tuple{
    int dist;
    int stops;
    int node;
    public Tuple(int dist,int stops,int node){
        this.dist=dist;
        this.stops=stops;
        this.node=node;
    }
}
class Pair{
    int node;
    int wt;
    Pair(int nd,int cost){
        node=nd;
        wt=cost;
    }
}



class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //<=k stops ke jo bhi paths honge unme ka shortest cost vla dist
       // Missing diamond operator or type parameter
Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(0, 0, src));

        Tuple strt=new Tuple(0,0,src);

        int dist[]=new int[n];
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        for(int i=0;i<flights.length;i++){
            int u=flights[i][0];
            int v=flights[i][1];
            int wt=flights[i][2];
            adj.get(u).add(new Pair(v,wt));
        }

        Arrays.fill(dist,(int)1e9);
        dist[src]=0;
        q.add(strt);
        while(!q.isEmpty()){
                Tuple remove=q.remove();
                int distnc=remove.dist;
                int stops=remove.stops;
                int removed_node=remove.node;
                if(stops>k) continue;
                for(int i=0;i<adj.get(removed_node).size();i++){

                    int reached_node=adj.get(removed_node).get(i).node;
                    //i reached at reched_node
                    int reach_cost=distnc+adj.get(removed_node).get(i).wt;
                    int reached_stops=stops+1;

                      
                    if(dist[reached_node]>reach_cost){

                        dist[reached_node]=reach_cost;
                        q.add(new Tuple(reach_cost,reached_stops,reached_node));

                    }

                }

        }
        if(dist[dst]==(int)1e9) return -1;
        return dist[dst];

    }
}
