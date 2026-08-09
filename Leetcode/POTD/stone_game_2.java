class Solution {
    int[][][] memo;
    int solve(int[] piles, int idx, int M, boolean isAlice){
        if(idx>=piles.length) return 0;
        int state=isAlice?1:0;
        if(memo[idx][M][state]!=-1) return memo[idx][M][state];
        int sum=0;
        if(isAlice){
            int ans=0;
            for(int X=1;X<=2*M && idx+X<=piles.length;X++){
                sum+=piles[idx+X-1];
                ans=Math.max(ans,sum+solve(piles,idx+X,Math.max(M,X),false));
            }
            return memo[idx][M][state]=ans;
        }else{
            int ans=Integer.MAX_VALUE;
            for(int X=1;X<=2*M && idx+X<=piles.length;X++){
                ans=Math.min(ans,solve(piles,idx+X,Math.max(M,X),true));
            }
            return memo[idx][M][state]=ans;
        }
    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        memo=new int[n][n+1][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                memo[i][j][0]=-1;
                memo[i][j][1]=-1;
            }
        }
        return solve(piles,0,1,true);
    }
}
