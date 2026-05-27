class Solution {

    int solve(int[] temp,int idx,int[] dp){

        if(idx==0) return temp[0];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int tak2=0,tak1=0;
        tak2=temp[idx]+solve(temp,idx-2,dp);
        tak1=0+solve(temp,idx-1,dp);
        return dp[idx]=Math.max(tak2,tak1);

    }


    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int[] temp1=new int[nums.length-1];
        int a=0;
        for(int i=1;i<nums.length;i++){
            temp1[a]=nums[i];a++;
        }
        a=0;
        int[] dp1=new int[nums.length];
        Arrays.fill(dp1,-1);
        int[] temp2=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            temp2[a]=nums[i];a++;
        }
        int idx=temp1.length-1;
        int a1=solve(temp1,idx,dp);
        int a2=solve(temp2,idx,dp1);
        return Math.max(a1,a2);
        
    }
}
