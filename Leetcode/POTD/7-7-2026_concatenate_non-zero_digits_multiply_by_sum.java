class Solution {
    public long sumAndMultiply(int n) {
        long sm=0;
      long ans=0;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
                ans=(ans*10)+( s.charAt(i)-'0');
                sm+=s.charAt(i)-'0';
            }


        }
        return ans*sm;
        
    }
}
