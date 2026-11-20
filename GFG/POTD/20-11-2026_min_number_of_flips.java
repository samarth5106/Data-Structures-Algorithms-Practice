class Solution {
    public int minFlips(String s) {
        // code here
        
        //01010101 way1 
       // means even pr 0 and odd pr 1
        
        
        
        //101010101 way2 
       // means even pr 1 and odd pr 0
        
        int cnt1=0;
        int cnt2=0;
        //00
        for(int i=0;i<s.length();i++){
            if((i&1)==1){
                //odd
                if(s.charAt(i)=='0'){
                 cnt1++;   
                }
                
                if(s.charAt(i)=='1'){
                    cnt2++;
                }
            }
            
            else{
                if(s.charAt(i)=='1'){
                    cnt1++;
                }
                if(s.charAt(i)=='0'){
                    cnt2++;
                }
            }
        }
        
        
        return Math.min(cnt1,cnt2);
        
    }
}
