class Solution{
    public int minimumDeletions(String s){
        int totA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')totA++;
        }
        int curB=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')totA--;
            ans=Math.min(ans,curB+totA);
            if(s.charAt(i)=='b')curB++;
        }
        return ans;
    }
}
