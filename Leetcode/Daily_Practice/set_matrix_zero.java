class Solution {
    public void setZeroes(int[][] mat) {
        int col=1;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==0&&j==0){
                    col=0;
                    mat[i][0]=0;
                }
               else if(mat[i][j]==0){
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }

        
        for(int i=mat.length-1;i>0;i--){
            for(int j=mat[i].length-1;j>0;j--){
                if(mat[0][j]==0||mat[i][0]==0){
                    mat[i][j]=0;
                }
            }
        }

        for(int i=mat[0].length-1;i>=0;i--){
            if(mat[0][0]==0) mat[0][i]=0;
        }
        for(int i=0;i<mat.length;i++){
            if(col==0) mat[i][0]=0;
        }
        
        
        
    }
}
