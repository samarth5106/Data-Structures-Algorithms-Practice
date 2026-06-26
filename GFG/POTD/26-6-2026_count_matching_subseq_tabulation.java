class Solution {

    public static int countWays(String s1, String s2) {
        // code here
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        //dp 1 based indexing
        //string 0 based indexing
        for(int j=1;j<=s2.length();j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=s1.length();i++){
            dp[i][0]=1;
        }
        dp[0][0]=1;
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=(dp[i-1][j]+dp[i-1][j-1])%((int)1e9+7);
                }
                else{
                    dp[i][j]=(dp[i-1][j]%((int)1e9+7));
                }
            }
        }
        
        return dp[s1.length()][s2.length()];
    }}
