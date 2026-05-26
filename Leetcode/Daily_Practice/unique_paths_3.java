class Solution {
    int solve(int i,int j,int[][] mat,int free,int cntf){
        if(i<0||i>=mat.length||j<0||j>=mat[0].length||mat[i][j]==-1) return 0;
        if(mat[i][j]==2&&cntf==free) return 1;
        if(mat[i][j]==2) return 0;

        int temp=mat[i][j];
        mat[i][j]=-1;

        int up=solve(i-1,j,mat,free,cntf+1);
        int rt=solve(i,j+1,mat,free,cntf+1);
        int lt=solve(i,j-1,mat,free,cntf+1);
        int dn=solve(i+1,j,mat,free,cntf+1);

        mat[i][j]=temp;

        return up+rt+lt+dn;
    }

    public int uniquePathsIII(int[][] mat) {
        int i=0;
        int j=0;
        int free=0;
        for(int a=0;a<mat.length;a++){
            for(int b=0;b<mat[0].length;b++){
                if(mat[a][b]==1){
                    i=a;j=b;free++;
                }
                else if(mat[a][b]==0||mat[a][b]==2){
                    free++;
                }
            }
        }
        int cntf=1;
        int cnt=solve(i,j,mat,free,cntf);
        return cnt;
    }
}
