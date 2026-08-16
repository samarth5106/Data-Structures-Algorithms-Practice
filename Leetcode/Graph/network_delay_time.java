class pair{
    int node;
    int wt;
    pair(int cost,int nd){
        node=nd;
        wt=cost;
    }
}

class Solution {

    public int networkDelayTime(int[][] times, int n, int k) {
        //soource = k 
        //destinitaj all other node, un sb me pohochne ka min dist
        //max among all those min dist
        int dist[]=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        
    ArrayList<ArrayList<pair>> adj=new ArrayList<>();
    for(int i=0;i<n+1;i++){
        adj.add(new ArrayList<>());
    }

        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int wt=times[i][2];
            adj.get(u).add(new pair(wt,v));
        }

        PriorityQueue<pair> pq=new PriorityQueue<pair>((x,y)->x.wt-y.wt);
        pq.add(new pair(0,k));
        while(!pq.isEmpty()){
            pair pr=pq.remove();
            int nd=pr.node;
            int cost=pr.wt;
            for(int i=0;i<adj.get(nd).size();i++){
                int v=adj.get(nd).get(i).node;
                int edgewt=adj.get(nd).get(i).wt;
                if(dist[v]>cost+edgewt){
                    dist[v]=cost+edgewt;
                    pq.add(new pair(dist[v],v));
                }
            }
        }
        int maxi=0;
        for(int i=1;i<n+1;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            maxi=Math.max(maxi,dist[i]);
        }
       
        return maxi;

    }
}
