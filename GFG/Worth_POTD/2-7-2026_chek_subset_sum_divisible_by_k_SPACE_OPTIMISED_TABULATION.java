class Solution {
    public boolean divisibleByK(int[] arr, int k) {
        boolean[] dp = new boolean[k];   // dp[r] = true agar koi non-empty subset ban chuka hai jiska sum%k == r
        
        for(int i = 0; i < arr.length; i++){
            boolean[] newDp = new boolean[k];
            int r = arr[i] % k;
            
            newDp[r] = true;   // sirf arr[i] ko akela subset bana lo
            
            for(int rem = 0; rem < k; rem++){
                if(dp[rem]){
                    newDp[rem] = true;                  // purana wala as-is rakho (arr[i] na lo)
                    newDp[(rem + r) % k] = true;         // purane subset mein arr[i] add karlo
                }
            }
            
            dp = newDp;
        }
        
        return dp[0];
    }
}
