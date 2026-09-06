
class Solution {
    
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // 2 colors 
        //bipartition possible
        //if i do numbering then odd - even type bhi bol skte
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<dislikes.length;i++){
            int u=dislikes[i][0];
            int v=dislikes[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<Integer> q=new LinkedList<>();
        int[] visited=new int[n+1];
        int[] color=new int[n+1];

        for(int j=1;j<n+1;j++){
            if(visited[j]==0){
                        q.add(j);
                        visited[j]=1;
                        color[j]=0;
                while(!q.isEmpty()){

           int nd=q.remove();
           

            for(int i=0;i<adj.get(nd).size();i++){

                if(visited[adj.get(nd).get(i)]==0){

                    visited[adj.get(nd).get(i)]=1;
                    if(color[nd]==1) color[adj.get(nd).get(i)]=0;
                    else color[adj.get(nd).get(i)]=1;

                    q.add(adj.get(nd).get(i));

                }

            }
        }
            }
        }
        

        for(int i=1;i<n+1;i++){
            int nd=i;
            for(int j=0;j<adj.get(nd).size();j++){
                if(color[nd]==color[adj.get(nd).get(j)]) return false;
            }
        }
        return true;


    }
}
