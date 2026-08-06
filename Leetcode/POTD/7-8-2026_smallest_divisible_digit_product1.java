class Solution {
    public int smallestNumber(int n, int t) {
        //>=n
        //prdcts of digit devisible by 't'
        int val=n;
        
        while(true){
            int prdct=1;
            String s=val+"";
            for(int i=0;i<s.length();i++){
                prdct*=s.charAt(i)-'0';
            }
            if(prdct%t==0) break;
            val++;
        }
        return val;
    }
}
