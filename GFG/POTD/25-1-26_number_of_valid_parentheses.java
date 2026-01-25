class Solution {
  public:
    int findWays(int n) {
        if(n%2!=0) return 0;
        int p=n/2;
        vector<long long> dp(p+1,0);
        dp[0]=1;
        for(int i=1;i<=p;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-1-j];
            }
        }
        return dp[p];
    }
};
