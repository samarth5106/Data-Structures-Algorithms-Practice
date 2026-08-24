class Solution {
    void bfs(int i,int[] visited, ArrayList<ArrayList<Integer>> adj){
        visited[i]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int nd=q.remove();

            for(int j=0;j<adj.get(nd).size();j++){
                if(visited[adj.get(nd).get(j)]==0){
                    visited[adj.get(nd).get(j)]=1;
                    q.add(adj.get(nd).get(j));
                }
            }
        }
        return ;
    }
    public int makeConnected(int n, int[][] connections) {
        //if they are all connected togetherly then have same parent forall nodes

        //n nodes so req - n-1 edges
        //cuently number of components - k 
        //so req- k-1 edges


        if(connections.length<n-1) return -1;
        int[] visited=new int[n];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                bfs(i,visited,adj);
                cnt++;
            }
        }
        return cnt-1;


        
    }
}
