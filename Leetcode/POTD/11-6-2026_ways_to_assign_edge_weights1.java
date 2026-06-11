class Solution {
    int maxdepth=0;
    void dfs(int node,int parent, int depth, ArrayList<Integer>[] adj){
        maxdepth=Math.max(maxdepth,depth);
        for(int nde:adj[node]){
            if(nde==parent) continue;
            dfs(nde,node,depth+1,adj);
        }
    }
    long power(long a,long b,long mod){
    long ans=1;

    while(b>0){
        if((b&1)==1){
            ans=(ans*a)%mod;
        }

        a=(a*a)%mod;
        b>>=1;
    }

    return ans;
}
    public int assignEdgeWeights(int[][] edges) {
        long MOD=(long)(1e9+7);
       // int ways=0;
        //odd=even+odd*odd
        int n=edges.length+1;
        //at each edge we have choice 1 or 2,,
        //depth 3= 1,1,1 OR 2 2 1 OR 1 2 2
        // as per depth only take care number of 1s be odd
        //depth 4 -number of 1s- 1,3, and baki 2 so uske cmbinations ka number 
        ArrayList<Integer>[] adj=new ArrayList[n+1];
        for(int i=1;i<=n;i++){
         adj[i]=new ArrayList<>();
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1,0,0,adj);
        return (int)power(2,maxdepth-1,MOD);
    }
}
