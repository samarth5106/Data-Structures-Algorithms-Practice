class Solution {
    boolean isit(String s, List<String> wd){
        for(int i=0; i<wd.size(); i++){
            if(wd.get(i).equals(s)) return true;
        }
        return false;
    }

    public boolean wordBreak(String s, List<String> wd) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        
        // Base case: Empty string hamesha breakable hoti hai
        dp[n] = true; 
        
        // Outer loop: Pichhe se shuru karenge (Bottom-Up)
        for(int i = n - 1; i >= 0; i--) {
            boolean verdict = false;
            
            // Inner loop: 'i' se lekar end tak ke saare partitions check karo
            for(int j = i; j < n; j++) {
                // Substring hamesha current index 'i' se shuru hogi, na ki 0 se!
                String sub = s.substring(i, j + 1);
                
                if(isit(sub, wd)) {
                    // Agar bacha hua aage ka part (j+1) valid hai, toh ye bhi valid hai
                    if(dp[j + 1]) {
                        verdict = true;
                        break; // Ek bhi valid split mil gaya toh aage check karne ki zaroorat nahi
                    }
                }
            }
            dp[i] = verdict;
        }
        
        // Final answer humesha wahan milega jahan se recursion shuru hota hai (index 0)
        return dp[0];
    }
}
