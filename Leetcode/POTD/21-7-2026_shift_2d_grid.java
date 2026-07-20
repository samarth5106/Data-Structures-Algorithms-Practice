class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k=k%(grid.length*grid[0].length);
        List<List<Integer>> ans=new ArrayList<>();

        while(k-->0){
            int back=grid[0][0];

            for(int i=0;i<grid.length;i++){
                int col=1;
                if(i!=0) col=0;
                for(int j=col;j<grid[0].length;j++){
                    int current_was=grid[i][j];
                    grid[i][j]=back;
                    back=current_was;
                    if(i==grid.length-1&&j==grid[0].length-1){
                        grid[0][0]=back;
                    }

                }
            }

        }

        for(int i=0;i<grid.length;i++){
            List<Integer> subans=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                subans.add(grid[i][j]);
            }
            ans.add(subans);
        }
        return ans;
        


    }
}
