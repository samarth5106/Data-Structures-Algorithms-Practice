class Solution {
    public boolean consecutiveSetBits(int n) {
        String s=Integer.toBinaryString(n);
        boolean isit=false;
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'&&s.charAt(i+1)=='1'){
                isit=true;count++;
            }
        }
        if(count==1) return true;
        else return false;
       
    }
}©leetcode
