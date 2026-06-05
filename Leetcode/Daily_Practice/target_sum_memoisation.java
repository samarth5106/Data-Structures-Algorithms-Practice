
class Solution {

    int solve(int idx,int[] nums,int target,int[][] dp){
        if(idx<0){
            if(target==0) return 1;
            return 0;
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        int nottake=solve(idx-1,nums,target,dp);
        int take=0;
        if(nums[idx]<=target){
            take=solve(idx-1,nums,target-nums[idx],dp);
        }
       dp[idx][target]=take+nottake;
        return  dp[idx][target];
    }
    public int findTargetSumWays(int[] nums, int tt) {
        //s1-s2==target
        //s1-(s-s1)==target
        //s1-s+s1==target
        //2s1==target+s
        //s1==target+s/2
        //s2=s-target/2;
        //both same 
        
        int s=0;
        for(int x:nums){
            s+=x;
        }
      if(Math.abs(tt)>s||s-tt<0||(s-tt)%2!=0) return 0;
        int target1=(s-tt)/2;
        int[][] dp=new int[nums.length][target1+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(nums.length-1,nums,target1,dp);
         return ans;
        
    }
}
