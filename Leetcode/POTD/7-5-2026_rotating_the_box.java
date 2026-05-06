class Solution{
    public char[][] rotateTheBox(char[][] mat){
        int cols=mat[0].length;
        int rows=mat.length;
        int currcol;
        int currow;
        char[][] ans=new char[cols][rows];

        for(int i=rows-1;i>=0;i--){
            currcol=rows-1-i;

            for(int j=cols-1;j>=0;j--){
                currow=j;
                char current=mat[i][j];

                if(current=='*'){
                    continue;
                }
                else if(current=='.'){
                    int k=j-1;
                    int J=j;

                    while(k>=0){
                        if(mat[i][k]=='#'){
                            mat[i][J]='#';
                            mat[i][k]='.';
                            J--;
                        }
                        else if(mat[i][k]=='*'){
                            break;
                        }
                        k--;
                    }
                }
            }

            for(int j=cols-1;j>=0;j--){
                ans[j][currcol]=mat[i][j];
            }
        }
        return ans;
    }
}
