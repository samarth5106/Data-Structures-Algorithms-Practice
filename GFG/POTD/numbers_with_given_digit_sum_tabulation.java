class Solution {
    public int countWays(int n, int sum) {
        // code here
       
        // number of numbers having digit sum =sum
        int[][] dp=new int[n+1][sum+1];
        
        dp[n][sum]=1;
        
        for(int i=n-1;i>=0;i--){
            
            for(int current=0;current<=sum;current++){
                int k=1;
                
                if(i!=0){
                    k=0;
                }
                
                int val=0;
                
                for(int j=k;j<10;j++){
                    if(current+j<=sum)
                 val+=dp[i+1][current+j];
                
                }
                dp[i][current]=val;
                
            }
            
        }
        
         int cnt=dp[0][0];
        if(cnt==0) return -1;
        return cnt;
       
    }
};
