class Solution {
    public String smallestPalindrome(String s) {
        //given string ka half le and usi ka reverse

        int len=s.length();
        //len=5
        // 0 to 4
        
        if(len==1) return s;
        int till=len/2;
        //till = 2
        char mid='c';
        if(len%2!=0){
            mid=s.charAt(till);
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder rev1=new StringBuilder(s.substring(0,till));
        char[] arr=new char[till];
        arr=rev1.toString().toCharArray();
        Arrays.sort(arr);
     
        rev1.setLength(0);
        for(char c:arr){
            rev1.append(c);
        }
        
        sb.append(rev1);
        if(len%2!=0) sb.append(mid);
        sb.append(rev1.reverse());

        
        return sb.toString();
        
    }
}
