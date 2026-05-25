class Solution {
    int solve(int n,int[] costs,int ind,int[] dp){
        if(ind==0){
            return 0;
        }
        if(ind<0){
            return 1000000000;
        }
        if(dp[ind]!=-1) return dp[ind];
        int one=costs[ind-1]+1*1+solve(n,costs,ind-1,dp);
        int two=1000000000;
        if(ind>1){
            two=costs[ind-1]+2*2+solve(n,costs,ind-2,dp);
        }
        int three=1000000000;
        if(ind>2){
            three=costs[ind-1]+3*3+solve(n,costs,ind-3,dp);
        }
        dp[ind]=Math.min(one,Math.min(two,three));
        return Math.min(one,Math.min(two,three));
    }

    public int climbStairs(int n,int[] costs){
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=solve(n,costs,n,dp);
        
        return ans;
    }
}
