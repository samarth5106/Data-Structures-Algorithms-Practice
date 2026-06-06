import java.util.*;

class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        
        // Base case: 0 coins allowed
        dp[0][0]=1; 
        for(int i=1;i<=amount;i++){
            dp[0][i]=0;
        }
        
        // Main Loops
        for(int idx=1;idx<=n;idx++){
            int current=coins[idx-1]; // Shifted index matching
            for(int amt=0;amt<=amount;amt++){
                int notpick=dp[idx-1][amt];
                int pick=0;
                if(amt>=current){
                    pick=dp[idx][amt-current]; // Infinite supply on same shifted row
                }
                dp[idx][amt]=pick+notpick;
            }
        }
        
        return dp[n][amount];
    }
}
