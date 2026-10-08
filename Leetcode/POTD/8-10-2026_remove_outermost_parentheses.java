class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int cnt=0;
        int l=0;
        int r=0;
        int removal=0;
        while(r<s.length()){
            ans.append(s.charAt(r));
            if(s.charAt(r)=='(') cnt++;
            else cnt--;
            if(cnt==0){

                ans.deleteCharAt(l-removal);
                ans.deleteCharAt(ans.length()-1);
                l=r+1;
                removal+=2;
            }
            r++;
        }
        return ans.toString();

    }
}
