class Solution {
    public int minFlips(String s) {
        int flip=0;
        int cnt0=0,cnt1=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            //all 1
            //all 0
            //only one 1
            //only one 0
            if(s.charAt(i)=='0')
                cnt0++;
            else cnt1++;
            
        }
       int c1=cnt0;
        int c2=cnt1;
        int c3=1;
        if(cnt1>=1){
            c3=cnt1-1;
        }
        int c4=Integer.MAX_VALUE;
        if(n>=2){
            int v1=0;
            if(s.charAt(0)!='1'){
                v1=1;
            }
            int v2=0;
            if(s.charAt(n-1)!='1')
                v2=1;

            c4=v1+v2;
            for(int i=1;i<n-1;i++){
                if(s.charAt(i)=='1') c4++;
            }
        }
        flip=Math.min(c1,Math.min(c2,Math.min(c3,c4)));
        return flip;
        
    }
}
