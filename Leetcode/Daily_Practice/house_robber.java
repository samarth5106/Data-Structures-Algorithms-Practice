class Solution {
    int solve(int[] nums,int idx,int[] dp){

        if(idx==0) return nums[0];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];

        int tak2=0,tak1=0;
       // if(idx>1)
        tak2=nums[idx]+solve(nums,idx-2,dp);
        tak1=0+solve(nums,idx-1,dp);
        dp[idx]=Math.max(tak1,tak2);
        return dp[idx];
    }

    public int rob(int[] nums) {
        int idx=nums.length-1;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int ans=solve(nums,idx,dp);
        return ans;
    }
}
