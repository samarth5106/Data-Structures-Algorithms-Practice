class Solution {
    void traversal(int nd,int[] visi, ArrayList<ArrayList<Integer>> adj){
            Queue<Integer> q=new LinkedList<>();
            q.add(nd);
            visi[nd]=1;
            while(!q.isEmpty()){
                int nod=q.poll();
                //nod ke nghbr in q and mark thm
                for(int i=0;i<adj.get(nod).size();i++){
                    if(visi[adj.get(nod).get(i)]==0){
                        
                    q.add(adj.get(nod).get(i));
                    visi[adj.get(nod).get(i)]=1;
                    }
                }
            }

    }
    public int numIslands(char[][] Grid) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
      int rows = Grid.length;
        int cols = Grid[0].length;
        
        int[][] grid = new int[rows][cols];
        int cnt = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (Grid[i][j] == '1') {
                    grid[i][j] = cnt;
                    cnt++;
                }
            }
        }
    // nodes1 based 1 to 9
        for(int i=0;i<cnt;i++){
            adj.add(new ArrayList<>());
        }
        int ans=0;
        int nd=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    //right
                    if(j!=grid[0].length-1){
                        if(grid[i][j+1]!=0){
                            adj.get(grid[i][j]).add(grid[i][j+1]);
                        }
                    }
                    //left 
                    if(j!=0){
                        if(grid[i][j-1]!=0){
                            adj.get(grid[i][j]).add(grid[i][j-1]);
                        }
                    }
                    //down
                    if(i!=grid.length-1){
                        if(grid[i+1][j]!=0){
                            adj.get(grid[i][j]).add(grid[i+1][j]);
                        }
                    }
                    //up
                    if(i!=0){
                        if(grid[i-1][j]!=0){
                            adj.get(grid[i][j]).add(grid[i-1][j]);
                        }
                    }
                }
            }
        }
        //adj list done
        
        int[] visi=new int[cnt];
        for(int i=1;i<cnt;i++){
          
            if(visi[i]==0){
                ans++;
                traversal(i,visi,adj);
            }
        }
        return ans;

    }
}
