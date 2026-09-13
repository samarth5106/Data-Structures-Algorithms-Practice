class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] temp=new int[n][n];
        int [][] res=new int[n][n];
        for(int i=0;i<n;i++){
            int k=rowShift[i];
            for(int j=0;j<n;j++){
                int newcol=(j-k+n)%n;
                temp[i][newcol]=grid[i][j];
            }
        }

        for(int j=0;j<n;j++){
            int k=colShift[j];
            for(int i=0;i<n;i++){
                int newrow=(i-k+n)%n;
                res[newrow][j]=temp[i][j];
            }
        }
        return res;
    }
}
