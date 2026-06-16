class Solution {

    // boolean solve(int i,int[] nums,Boolean[] dp){
    //     if(i==nums.length-1) return true;
    //     if(dp[i]!=null) return dp[i];
    //     int val=nums[i];
    //     for(int j=1;j<=val;j++){
    //         boolean reached=solve(i+j,nums,dp);
    //         if(reached) return dp[i]=true;
    //     }
    //     return dp[i]=false;

    // }

    public boolean canJump(int[] nums) {
       // boolean ans=solve(0, nums);
        boolean[] dp=new boolean[nums.length];
        dp[nums.length-1]=true;
        for(int i=nums.length-2;i>=0;i--){
            int val=nums[i];
            for(int j=1;j<=val;j++){
                boolean reached=dp[i+j];
                if(reached){
                    dp[i]=true;break;
                }
            }
        }
        return dp[0];
    }
}
