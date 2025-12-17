class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        s=s.toLowerCase();
        int j=s.length();
        j--;
        char ch;
        while(i<j){
            if(s.charAt(i)==' '||s.charAt(i)<47||((s.charAt(i)<97&&s.charAt(i)>57)||s.charAt(i)>122)){
                i++;continue;
            }
            if(s.charAt(j)==' '||s.charAt(j)<47||((s.charAt(j)<97&&s.charAt(j)>57)||s.charAt(j)>122)){
                j--;continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;i++;
        }
    return true;
    }
}
