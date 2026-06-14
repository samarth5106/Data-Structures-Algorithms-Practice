class Solution {
    public boolean checkGoodInteger(int n) {
        String s=""+n;
        int sqsm=0;
        int sm=0;
        for(int i=0;i<s.length();i++){
            sm+=s.charAt(i)-'0';
            sqsm+=(s.charAt(i)-'0')*(s.charAt(i)-'0');
        }
        if(sqsm-sm>=50) return true;
        return false;
    }
}©leetcode
