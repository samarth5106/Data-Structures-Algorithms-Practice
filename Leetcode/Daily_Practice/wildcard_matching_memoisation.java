class Solution {

    boolean solve(int i,int j,String p,String s,Boolean[][] dp){
        if(i<0&&j<0) return true;
        if(i<0&j>=0) return false;
        if(j<0&&i>=0){
            for(i=i;i>=0;i--){
                if(p.charAt(i)!='*') return false;
            }
            return true;
        } 
        if(dp[i][j]!=null) return dp[i][j];
        if(p.charAt(i)==s.charAt(j)||p.charAt(i)=='?'){
        return dp[i][j]= solve(i-1,j-1,p,s,dp);
        }

         if(p.charAt(i)=='*'){
            return dp[i][j]=solve(i-1,j,p,s,dp)|solve(i,j-1,p,s,dp);
        }

        return false;
    }



    public boolean isMatch(String s, String p) {
        Boolean[][] dp=new Boolean[p.length()][s.length()];
        // for(int i=0;i<s.length();i++){
        //     Arrays.fill(dp[i],-1);
        // }

        return solve(p.length()-1,s.length()-1,p,s,dp);

    }
}
