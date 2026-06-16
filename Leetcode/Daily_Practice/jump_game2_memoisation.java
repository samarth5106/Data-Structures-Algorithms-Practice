class Solution {
     int solve(int i,int[] nums,int[] dp){
        if(i>=nums.length-1) return 0;

        if(dp[i]!=-1) return dp[i];
        int jumps=nums.length-1;
        int val=nums[i];
        for(int j=1;j<=val;j++){
           jumps=Math.min(jumps,1+solve(i+j,nums,dp));
        }
        return dp[i]=jumps;
        

    }
    public int jump(int[] nums) {
       
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
         int ans=solve(0, nums,dp);
        return ans;
        
    }
}
