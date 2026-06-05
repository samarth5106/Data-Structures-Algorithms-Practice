import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int amt=1;amt<=amount;amt++){
            dp[0][amt]=1000000000;
        }
        dp[0][0]=0;
        for(int idx=1;idx<=n;idx++){
            int current_coin=coins[idx-1];
            for(int amt=0;amt<=amount;amt++){
                int notpick=dp[idx-1][amt];
                int pick=1000000000;
                if(current_coin<=amt){
                    pick=1+dp[idx][amt-current_coin];
                }
                dp[idx][amt]=Math.min(notpick,pick);
            }
        }
        int ans=dp[n][amount];
        if(ans>=1000000000)return -1;
        return ans;
    }
}
