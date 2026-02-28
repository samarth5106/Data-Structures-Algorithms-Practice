class Solution {
  public:
    int countSquare(vector<vector<int>>& mat, int x) {
        int n=mat.size();
        int m=mat[0].size();
        int cnt=0;
        
        vector<vector<int>> prefix(n+1,vector<int>(m+1,0));
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                prefix[i][j]=mat[i-1][j-1]+prefix[i-1][j]+prefix[i][j-1]-prefix[i-1][j-1];
            }
        }
        
        int maxSize=min(n,m);
        
        for(int size=1;size<=maxSize;size++){
            for(int i=0;i<=n-size;i++){
                for(int j=0;j<=m-size;j++){
                    int r1=i+1;
                    int c1=j+1;
                    int r2=i+size;
                    int c2=j+size;
                    
                    int sum=prefix[r2][c2]-prefix[r1-1][c2]-prefix[r2][c1-1]+prefix[r1-1][c1-1];
                    
                    if(sum==x) cnt++;
                }
            }
        }
        
        return cnt;
    }
};
