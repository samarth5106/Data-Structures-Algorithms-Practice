class Solution {
     int solve(int len,int cnt,int last,int n,int k,int[][][]dp){
      if(cnt>k) return 0;
      if(len==n){
          if(cnt==k) return 1;
          return 0;
      }
      
      if(dp[len][cnt][last]!=-1) return dp[len][cnt][last];
      int zro=0;
      int one=0;
      
          zro=solve(len+1,cnt,0,n,k,dp);
          if(last==1)
          one=solve(len+1,cnt+1,1,n,k,dp);
          else{
              one=solve(len+1,cnt,1,n,k,dp);
          }
      
      
      
      return dp[len][cnt][last]= (zro + one) % ((int)1e9+7);
      
  }
    public int countStrings(int n, int k) {
        // code here
        if(k>=n) return 0;
        int[][][] dp=new int[n+1][k+1][2];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<k+1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        int zro=solve(1,0,0,n,k,dp);
        int one=solve(1,0,1,n,k,dp);
        int cnt=(zro+one)%((int)1e9+7);
        return cnt;
    }
}
