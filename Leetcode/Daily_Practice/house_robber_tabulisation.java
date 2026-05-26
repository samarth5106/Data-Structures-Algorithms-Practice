class Solution {
    public int rob(int[] nums) {
       // int idx=nums.length-1;
        int[] dp=new int[nums.length];
       // Arrays.fill(dp,-1);
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int tak2=0,tak1=0;
            tak2=nums[i];
            if(i>1) tak2+=dp[i-2];
            tak1=0+dp[i-1];

            dp[i]=Math.max(tak2,tak1);
        }
       // int ans=solve(nums,idx,dp);
        return dp[nums.length-1];
    }
}
