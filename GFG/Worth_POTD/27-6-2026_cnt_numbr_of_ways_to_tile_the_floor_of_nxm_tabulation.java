class Solution{

    public int countWays(int n, int m) {
        // code here.
       
        int[] dp=new int[n+1];
        if(n<m) return 1;
        dp[m]=2;
        for (int i = 1; i < m; i++) {
            dp[i] = 1;
        }
        
        for(int i=m+1;i<=n;i++){
            
                int hor=0;
                int verti=0;
                hor=dp[i-1];
                if(i-m>=0)
                verti=dp[i-m];
                
                dp[i]=(hor+verti)%((int)1e9+7);
                
                
            
        }
        return dp[n];
      }
};
