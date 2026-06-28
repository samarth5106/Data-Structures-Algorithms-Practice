class Solution {
    public int countStrings(int n,int k) {
        if(k>=n) return 0;
        int MOD=1000000007;
        int[][][] dp=new int[n+1][k+1][2];
        
        dp[n][k][0]=1;
        dp[n][k][1]=1;
        
        for(int len=n-1;len>=0;len--){
            for(int cnt=k;cnt>=0;cnt--){
                for(int last=0;last<=1;last++){
                    int zro=dp[len+1][cnt][0];
                    int one=0;
                    if(last==1){
                        if(cnt+1<=k){
                            one=dp[len+1][cnt+1][1];
                        }
                    }else{
                        one=dp[len+1][cnt][1];
                    }
                    dp[len][cnt][last]=(zro+one)%MOD;
                }
            }
        }
        return dp[0][0][0];
    }
}
