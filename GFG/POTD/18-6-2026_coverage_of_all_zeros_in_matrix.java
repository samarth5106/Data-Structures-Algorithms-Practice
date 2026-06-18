class Solution {
    public int findCoverage(int[][] mat) {
        // code here
          int cnt=0;
        boolean cols[]=new boolean[mat[0].length];
        boolean left=false;
        for(int i=0;i<mat.length;i++){
            left=false;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    left=true;
                    cols[j]=true;
                }
                if(mat[i][j]==0){
                    if(left==true) cnt++;
                    if(cols[j]==true) cnt++;
                    for(int k=j+1;k<mat[0].length;k++){
                        if(mat[i][k]==1) {cnt++;break;}
                    }
                    for(int k=i+1;k<mat.length;k++){
                        if(mat[k][j]==1){
                            cnt++;
                            break;
                        }
                    }
                }
                
            }
        }
        return cnt;
    }
}
