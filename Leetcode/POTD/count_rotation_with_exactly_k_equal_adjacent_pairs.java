class Solution {
    public int countRotations(String s, int k) {
        int v=0;
        int scr=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))scr++;
        }
        int cnt=0;
        if(scr==k) cnt++;
        
        while(v<s.length()-1){
            String prf=s.substring(0,v+1);
            String rem=s.substring(v+1);
            
        StringBuilder sub=new StringBuilder();
            scr=0;
            sub.append(rem).append(prf);
            
            for(int i=0;i<sub.length()-1;i++){
                if(sub.toString().charAt(i)==sub.toString().charAt(i+1)) scr++;
            }
            
            if(scr==k) cnt++;
            v++;
        }
        return cnt;
    }
}
