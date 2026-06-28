class Solution {
    boolean isit(String s,List<String> wd){
        for(int i=0;i<wd.size();i++){
            if(wd.get(i).equals(s)) return true;
        }
        return false;
    }
    boolean solve(int I,String s,List<String> wd,Boolean[] dp){
        if(I==s.length()) return true;
         boolean verdict=false;
         if(dp[I]!=null)return dp[I];
        for(int i=I;i<s.length();i++){
            String sub=s.substring(I,i+1);
            boolean present=isit(sub,wd);
            if(present){
                verdict=solve(i+1,s,wd,dp);
                if(verdict) return true;
            }
            
        }
        return dp[I]=verdict;
    }
    public boolean wordBreak(String s, List<String> wd) {
        
        Boolean[] dp=new Boolean[s.length()];
      
boolean verdict=solve(0,s,wd,dp);
        return verdict;
    }
}
