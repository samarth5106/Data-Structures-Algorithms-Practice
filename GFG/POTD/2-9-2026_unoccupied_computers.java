class Solution {
    public int solve(int n, String s) {
        // code here
       // n- stack.size()
       int freq[]=new int[26+1];
       // capital - 65  to  90 
       
       int rem=n;
       int ans=0;
       for(int i=0;i<s.length();i++){
           freq[s.charAt(i)-'A']++;
           if(freq[s.charAt(i)-'A']==1&&rem!=0){
               rem--;
           }
           else if(freq[s.charAt(i)-'A']==1&&rem==0){
               ans++;
               freq[s.charAt(i)-'A']=-1;
           }
           
           if(freq[s.charAt(i)-'A']==2){
               rem++;
           }
       }
       return ans;
    }
}
