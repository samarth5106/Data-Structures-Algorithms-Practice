class Solution {
    
public static int solve(int i,int j,String s1,String s2,int[][] dp){
      if(i<0&&j>=0) return 0;
      if(j<0) return 1;
      if(dp[i][j]!=-1) return dp[i][j];
      int cnt=0;
      if(s1.charAt(i)==s2.charAt(j)){
          
          
          cnt+=(cnt+solve(i-1,j,s1,s2,dp)+solve(i-1,j-1,s1,s2,dp))%((int)1e9+7);
      }
      else{
          cnt=(cnt+solve(i-1,j,s1,s2,dp))%((int)1e9+7);
      }
      return dp[i][j]=cnt;
  }
    public static int countWays(String s1, String s2) {
        // code here
        int[][] dp=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        int cnt=solve(s1.length()-1,s2.length()-1,s1,s2,dp);
        return cnt;
    }}
