import java.util.*;

class Solution {
    boolean issafe(int i,int j,int[][] mat,int totR,int totc){
        if(i+1<totR){
            if(j+2<totc&&mat[i+1][j+2]==1)return false;
            if(j-2>=0&&mat[i+1][j-2]==1)return false;
        }
        if(i-1>=0){
            if(j+2<totc&&mat[i-1][j+2]==1)return false;
            if(j-2>=0&&mat[i-1][j-2]==1)return false;
        }
        if(i+2<totR){
            if(j+1<totc&&mat[i+2][j+1]==1)return false;
            if(j-1>=0&&mat[i+2][j-1]==1)return false;
        }
        if(i-2>=0){
            if(j+1<totc&&mat[i-2][j+1]==1)return false;
            if(j-1>=0&&mat[i-2][j-1]==1)return false;
        }
        return true;
    }

    int solve(int cell,int knt,int[][] mat,int n,int m){
        if(knt==0)return 1;
        if(cell==n*m)return 0;
        int i=cell/m;
        int j=cell%m;
        int place=0;
        if(issafe(i,j,mat,n,m)){
            mat[i][j]=1;
            place=solve(cell+1,knt-1,mat,n,m);
            mat[i][j]=0;
        }
        int notplace=solve(cell+1,knt,mat,n,m);
        return place+notplace;
    }

    public int numOfWays(int n,int m) {
        int[][] mat=new int[n][m];
        return 2*solve(0,2,mat,n,m);
    }
}
