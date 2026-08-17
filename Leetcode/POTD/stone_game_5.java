class Solution {

// int sumrow(int strt,int end,int[] arr){
//     int sum=0;
//     for(int i=strt;i<=end;i++){
//         sum+=arr[i];
//     }
//     return sum;
// }

int solve(int strt,int end,int[] stones,int[][] dp,int[] prfx){

    if(end-strt+1==1) return 0;

    if(dp[strt][end]!=-1) return dp[strt][end];
    int finl=0;
    for(int i=strt;i<=end;i++){
        
        int sumleft=prfx[i];//sumrow(strt,i,stones);
        if(strt!=0) sumleft-=prfx[strt-1];

        int sumright=prfx[end]-prfx[i];//sumrow(i+1,end,stones);
        int ans=0;
        if(sumleft>sumright){
            ans+=sumright+solve(i+1,end,stones,dp,prfx);
        }
        else if(sumleft<sumright){
            ans+=sumleft+solve(strt,i,stones,dp,prfx);
        }
        else{
            ans+=sumleft+Math.max(solve(strt,i,stones,dp,prfx),solve(i+1,end,stones,dp,prfx));
        }
        finl=Math.max(finl,ans);

    }

    return dp[strt][end]=finl;

}

    public int stoneGameV(int[] stones) {
        //alice - divides the row 
        //then take the value min(leftrow,rightrow) and discards the max val row
        // if value of both row is same then dependsof alice which row to remove

        //divide sub a way that diff between both row is min
        int[] prfx=new int[stones.length];
        prfx[0]=stones[0];
        for(int i=1;i<stones.length;i++){
            prfx[i]=prfx[i-1]+stones[i];
        }


        int dp[][]=new int[stones.length+1][stones.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(0,stones.length-1,stones,dp,prfx);
        return ans;


    }
}
