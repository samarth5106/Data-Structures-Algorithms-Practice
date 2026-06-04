class Solution {
    int maxSubstring(String s) {
        // code here
         int zero=0;
         int one=0;
        
         int maxi=Integer.MIN_VALUE;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='0') zero++;
             else one++;
         }
          if(one==s.length()) return -1;
         
         int l=0;
         while(s.charAt(l)=='1'){
             l++;
         }
         int r=l+1;
         int cnt=1;
         maxi=1;
         while(r<s.length()){
             if(s.charAt(r)=='0'){
                 cnt++;
             }
             else{
                 cnt--;
                 
             }
             if(cnt<0){
                 cnt=0;
             }
             maxi=Math.max(cnt,maxi);
             r++;
         }
         return maxi;
         
        
    }
}
