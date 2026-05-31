class Solution {

   
    public boolean canPartition(int[] nums) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean[][] dp=new boolean[nums.length+1][target+1];
        for(int i=0;i<nums.length+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<nums.length+1;i++){
            for(int targt=1;targt<target+1;targt++){
                boolean pick=false;
            if(targt>=nums[i-1]) pick=dp[i-1][targt-nums[i-1]];
            boolean notpick=dp[i-1][targt];
            dp[i][targt]=pick|notpick;
            }
            
        }
        return dp[nums.length][target];

       // return target(nums.length-1,nums,target,dp);

    }
}
