 public int jump(int[] nums) {
       
        int[] dp=new int[nums.length+1];
        dp[nums.length]=0;
        for(int i=nums.length-1;i>0;i--){
            int val=nums[i-1];
            int mini=nums.length;
            for(int j=1;j<=val;j++){
                if(i+j>=nums.length+1) break;
                mini=Math.min(mini,1+dp[i+j]);
            }
            dp[i]=mini;
        }
         int ans=dp[1];
        return ans;
        
    }
