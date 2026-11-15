class Solution {
    
    
    
    public int subsequenceSum(String s) {
        // code here
        int n=s.length();
        long ans=0;
        
        long mod = 1000000007;
        long powerOfTwo = 1;
        
        for (int i = 0; i < n - 1; i++) {
            powerOfTwo = (powerOfTwo * 2) % mod;
        }
        
        for(int i=0;i<s.length();i++){
           ans=(ans+((s.charAt(i)-'0')*powerOfTwo))%mod;
        }
        int r = (int)(ans % 1000000007);
        return r;
    }
}
