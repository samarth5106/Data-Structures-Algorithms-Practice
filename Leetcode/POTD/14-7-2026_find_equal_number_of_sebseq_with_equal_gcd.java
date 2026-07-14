class Solution {

    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    int solve(int[] nums,int i,int first,int second,int[][][] dp){

        if(i==nums.length){
            if(first==0&&second==0){
                return 0;
            }
            if(first==second) return 1;
            return 0;
        }

        if(dp[i][first][second]!=-1) return dp[i][first][second];

        int skip=solve(nums,i+1,first,second,dp);
        int take1=solve(nums,i+1,gcd(first,nums[i]),second,dp);
        int take2=solve(nums,i+1,first,gcd(second,nums[i]),dp);
        
        long ans=(long)skip+take1+take2;
        return dp[i][first][second]=(int)((ans)%((int)1e9+7));
    }

    public int subsequencePairCount(int[] nums) {
        int[][][] dp=new int[nums.length][201][201];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<201;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int ans=solve(nums,0,0,0,dp);

        return ans;
        
    }
}
