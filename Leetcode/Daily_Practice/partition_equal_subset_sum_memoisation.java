class Solution {

    boolean target(int idx,int[] nums,int target,Boolean[][] dp){
        if(target==0) return false;
        if(idx==0) return nums[0]==target;
        if(dp[idx][target]!=null) return dp[idx][target];
        boolean pick=false;
        if(target>=nums[idx])
         pick=target(idx-1,nums,target-nums[idx],dp);

        boolean notpick=target(idx-1,nums,target,dp);

        return dp[idx][target]=pick|notpick;
    }
    public boolean canPartition(int[] nums) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }
        if(sum%2!=0) return false;
        int target=sum/2;
        Boolean[][] dp=new Boolean[nums.length][target+1];
        return target(nums.length-1,nums,target,dp);

    }
}
