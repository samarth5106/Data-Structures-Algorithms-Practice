import java.util.*;

class Solution {
    public int findTargetSumWays(int[] nums, int tt) {
        int s=0;
        for(int x:nums){
            s+=x;
        }
        if(Math.abs(tt)>s||(s-tt)<0||(s-tt)%2!=0)return 0;
        int target1=(s-tt)/2;
        int n=nums.length;
        int[][] dp=new int[n+1][target1+1];
        dp[0][0]=1;
        for(int idx=1;idx<=n;idx++){
            int current_val=nums[idx-1];
            for(int targt=0;targt<=target1;targt++){
                int nottake=dp[idx-1][targt];
                int take=0;
                if(current_val<=targt){
                    take=dp[idx-1][targt-current_val];
                }
                dp[idx][targt]=(nottake+take);
            }
        }
        return dp[n][target1];
    }
}
