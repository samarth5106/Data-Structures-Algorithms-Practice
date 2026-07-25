class Solution {
    public int maxProduct(int n) {
          String num=Integer.toString(n);
        int flargst=num.charAt(0)-'0';
        int seclargst=0;
        for(int i=1;i<num.length();i++){
            if(num.charAt(i)-'0'>flargst){
             if(flargst>seclargst) seclargst=flargst;
                flargst=num.charAt(i)-'0';
            }
           else if (num.charAt(i)-'0'>seclargst) seclargst=num.charAt(i)-'0';
        }
        return flargst*seclargst;
    }
}
