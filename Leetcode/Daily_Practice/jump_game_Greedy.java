class Solution {


    public boolean canJump(int[] nums) {
       // boolean ans=solve(0, nums);
       // boolean[] dp=new boolean[nums.length];
        //dp[nums.length-1]=true;
        int goal=nums.length-1;
        
        for(int i=nums.length-2;i>=0;i--){
            int val=nums[i];
            if(i+val>=goal){
                goal=i;
            }
            
        }
        return goal==0;
    }
}
