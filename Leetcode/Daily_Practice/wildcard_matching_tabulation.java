class Solution {

    public boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[p.length()+1][s.length()+1];
        //for dp table 1 based indexing
        // for string 0 based indexing 
        dp[0][0]=true;
        for(int j=1;j<=s.length();j++){
            dp[0][j]=false;
        }
        for(int i=1;i<=p.length();i++){
            boolean isit=true;
            for(int k=i;k>0;k--){
                if(p.charAt(k-1)!='*'){
                    dp[i][0]=false;isit=false;break;
                }
            }
            if(isit) dp[i][0]=true;
        }

        for(int i=1;i<=p.length();i++){
            for(int j=1;j<=s.length();j++){
                if(p.charAt(i-1)==s.charAt(j-1)||p.charAt(i-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(i-1)=='*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
                else
                dp[i][j]=false;
            }
        }


        return dp[p.length()][s.length()];

    }
}
