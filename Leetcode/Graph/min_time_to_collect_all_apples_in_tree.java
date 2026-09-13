class Solution {
   // int ans=0;
    int dfs( ArrayList<ArrayList<Integer>> adj, int child, int parent, List<Boolean> hasApple){

        //if(hasApple.get(child)) ans+=2;
        int ans=0;

        for(int i=0;i<adj.get(child).size();i++){
            if(adj.get(child).get(i)==parent) continue;
           int timefrmchild= dfs(adj,adj.get(child).get(i),child,hasApple);

           if(timefrmchild>0||hasApple.get(adj.get(child).get(i))){
            ans+=timefrmchild+2;
           }

        }
        return ans;
    }


    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int ans=dfs(adj,0,-1,hasApple);
        return ans;
    }
}
