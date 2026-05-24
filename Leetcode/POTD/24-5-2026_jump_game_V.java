class Solution {

    int solve(int[] nums,int d,int[] dp,int idx){
        if(dp[idx]!=-1) return dp[idx];
        int maxi=1;
        for(int i=idx-1;i>=Math.max(0,idx-d);i--){
            if(nums[i]>=nums[idx]) break;
            maxi=Math.max(maxi,1+solve(nums,d,dp,i));
        }
        for(int i=idx+1;i<=Math.min(nums.length-1,idx+d);i++){
            if(nums[i]>=nums[idx]) break;
            maxi=Math.max(maxi,1+solve(nums,d,dp,i));
        }
        dp[idx]=maxi;
        return dp[idx];
    }
    public int maxJumps(int[] arr,int d) {
        int dp[]=new int[arr.length];
        Arrays.fill(dp,-1);
        int ans=1;
        for(int i=0;i<arr.length;i++){
            ans=Math.max(ans,solve(arr,d,dp,i));
        }
        return ans;
    }
}
