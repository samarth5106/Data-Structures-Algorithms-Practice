class Solution {
    int bfs(int node,ArrayList<ArrayList<Integer>> adj,int[] visited){
           int[] arr=new int[adj.size()];
       Arrays.fill(arr,-1);
         int cnt=0;
        visited[node]=1;
        arr[node]=adj.get(node).size();
        cnt++;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
       
     
        while(!q.isEmpty()){
            int nd=q.remove();
             arr[nd]=adj.get(nd).size();
            //if(adj.get(nd).size()!=l) isit=false;
            //nd ke neighbours mark visited and put in q
            for(int i=0;i<adj.get(nd).size();i++){
                if(visited[adj.get(nd).get(i)]==0){
                   
                    cnt++;
                    visited[adj.get(nd).get(i)]=1;
                    q.add(adj.get(nd).get(i));
                }
            }
        }
     boolean isit=true;
        int l=cnt-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1&&arr[i]!=l){ isit=false;break;}
        }
        if(isit) return 1;
        return 0;

        

    }
    public int countCompleteComponents(int n, int[][] edges) {
        //undirected , 0 based vertices, 
        int[] visited=new int[n];
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

        int cnt=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                cnt+=bfs(i,adj,visited);
            }
        }
        return cnt;
    }
}
