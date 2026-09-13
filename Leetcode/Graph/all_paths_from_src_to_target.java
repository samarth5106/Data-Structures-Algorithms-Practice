class Solution {
     List<List<Integer>> ans=new ArrayList<>();
     void dfs(int[][] graph,int node,ArrayList<Integer> part){

        if(node==graph.length-1){
            ans.add(new ArrayList<>(part));
            return ;
        }

        for(int i=0;i<graph[node].length;i++){
            
            part.add(graph[node][i]);
            dfs(graph,graph[node][i],part);
            part.remove(part.size()-1);
            
        }
        return;
     }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 0 to n-1
        //bfs
        //dijkstras
        //no need to make adjacency list already given
        ArrayList<Integer> part=new ArrayList<>();
        part.add(0);
        dfs(graph,0,part);
        return ans;
   

    }
}
