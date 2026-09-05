class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        int n=rooms.size();
        int[] visited=new int[n];

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<rooms.size();i++){
            int u=i;
            for(int j=0;j<rooms.get(i).size();j++){
                 
            int v=rooms.get(i).get(j);
            adj.get(u).add(v);
           
            }
           
        }

        q.add(0);
        visited[0]=1;
        int cnt=1;
        while(!q.isEmpty()){
            int node=q.remove();
           // if(node==destination) return true;
            for(int i=0;i<adj.get(node).size();i++){
                if(visited[adj.get(node).get(i)]==0){
                    visited[adj.get(node).get(i)]=1;
                    cnt++;
                    q.add(adj.get(node).get(i));
                }
            }
        }
        return cnt==n;
       // return false;
    }
}
