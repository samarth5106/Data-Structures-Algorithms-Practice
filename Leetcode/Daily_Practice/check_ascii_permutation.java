class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            String binary=String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
         //   
            sb.append(binary);
            
        }
        int l=0;
        int r=sb.length()-1;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)) return  false;
            l++;
            r--;
        }
        return true;
    }
}
