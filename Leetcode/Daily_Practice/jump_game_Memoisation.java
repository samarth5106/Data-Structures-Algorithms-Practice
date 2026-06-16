class Solution {

    boolean solve(int i,int[] nums,Boolean[] dp){
        if(i==nums.length-1) return true;
        if(dp[i]!=null) return dp[i];
        int val=nums[i];
        for(int j=1;j<=val;j++){
            boolean reached=solve(i+j,nums,dp);
            if(reached) return dp[i]=true;
        }
        return dp[i]=false;

    }

    public boolean canJump(int[] nums) {
       // boolean ans=solve(0, nums);
        Boolean[] dp=new Boolean[nums.length];
        boolean ans=solve(0,nums,dp);

        return ans;
    }
}
