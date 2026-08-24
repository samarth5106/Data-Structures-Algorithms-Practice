// class tuple{

//     int x;
//     int y;
//     int idx;
//     tuple(int x,int y,int idx){
//         this.x=x;
//         this.y=y;
//         this.idx=idx;
//     }

// }

class Solution {

    int bfs(int i,int[] visited,ArrayList<ArrayList<Integer>> adj,int[][] stones){

       visited[i]=1;

        

        Queue<Integer> q=new LinkedList<>();

        q.add(i);
        int cnt=1;

        while(!q.isEmpty()){

           // tuple tp=
           int index=q.remove();

            for(int j=0;j<adj.get(index).size();j++){
                int idx=adj.get(index).get(j);

                if(visited[idx]==0){
                    visited[idx]=1;
                    q.add(idx);
                     cnt++;
                }
            }

        }
        return cnt;
    }
    public int removeStones(int[][] stones) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<stones.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<stones.length;i++){

            int x=stones[i][0];
            int y=stones[i][1];

            for(int j=0;j<stones.length;j++){

                if(j==i) continue;
                int tx=stones[j][0];
                int ty=stones[j][1];
                if(x==tx||y==ty)
                adj.get(i).add(j);

            }
        }

        int[] visited=new int[stones.length];

        int totalremoved=0;

        for(int i=0;i<stones.length;i++){

            if(visited[i]==0){
                totalremoved+=bfs(i,visited,adj,stones)-1;
            }

        }

        return totalremoved;

    }
}
