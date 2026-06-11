class Solution {
    int solve(int i,int j, String s1,String s2,int[][] dp){
        if(i<0||j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
          return dp[i][j]= 1+solve(i-1,j-1,s1,s2,dp);
        }

        else{
          return dp[i][j]= 0+Math.max(solve(i-1,j,s1,s2,dp),solve(i,j-1,s1,s2,dp));
        }
       // return dp[i][j];

    }

    public int longestPalindromeSubseq(String s1) {
        String s2=new StringBuilder(s1).reverse().toString();
        int[][] dp=new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(s1.length()-1,s2.length()-1,s1,s2,dp);
        return ans;
    }
}
