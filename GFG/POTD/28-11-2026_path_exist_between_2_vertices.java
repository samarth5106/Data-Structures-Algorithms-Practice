class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        // code here
        int src=u;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
    boolean[] visited=new boolean[adj.size()];
    Arrays.fill(visited,false);
       visited[u]=true;
        while(!q.isEmpty()){
            int nd=q.poll();
            if(nd==v) return true;
            for(int i=0;i<adj.get(nd).size();i++){
                if(visited[adj.get(nd).get(i)]==false){
                    visited[adj.get(nd).get(i)]=true;
                    q.add(adj.get(nd).get(i));
                    
                }
            }
        }
        
        return false;
    }
}
