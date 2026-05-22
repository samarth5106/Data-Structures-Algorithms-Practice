class Solution {
    public String longestPalindrome(String s) {
        int maxi=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            int cnt=1;
            int l=i-1,r=i+1;
            while(r!=s.length()&&s.charAt(r)==s.charAt(i)){
                r++;cnt++;
            }
            while(l>=0&&s.charAt(l)==s.charAt(i)){
                l--;cnt++;
            }
            while(l>=0&&r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    l--;r++;
                    cnt+=2;
                }
                else break;
            }
           // cnt-=2;
            if(maxi<cnt){
                maxi=cnt;
                ans=s.substring(l+1,r);
            }
            
        }
        
        return ans;
    }
}
