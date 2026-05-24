class Solution {
    String ans="";
    String RLE(String s){
        String toret="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int cnt=1;
            int j=i+1;
            while(j<s.length()&&s.charAt(j)==ch){
                cnt++;
                j++;
            }
            i=j-1;
            toret+=cnt+""+ch;
        }
        return toret;
    }
    String solve(int n){
        if(n==1) return "1";
        ans=RLE(solve(n-1));

        return ans;
    }
    public String countAndSay(int n) {
        return solve(n);
    }
}
