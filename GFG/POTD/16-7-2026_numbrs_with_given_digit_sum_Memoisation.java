class Solution {
   
    int solve(int i,int current,int n,int sum,int[][] dp){
       
        if(current>sum||i>n) return 0;
       
        if(i==n){
            if(current==sum) return 1;
            return 0;
        }
       
        if(dp[i][current]!=-1) return dp[i][current];
       
        int k=1;
       
        if(i!=0){
         k=0;
        }
        int val=0;
       
        for(int j=k;j<10;j++){
            val+=solve(i+1,current+j,n,sum,dp);
        }
       
        return dp[i][current]=val;
       
    }
   
    public int countWays(int n, int sum) {
        // code here
       
        // number of numbers having digit sum =sum
        int[][] dp=new int[n][82];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
         int cnt=solve(0,0,n,sum,dp);
        if(cnt==0) return -1;
        return cnt;
       
    }
};
