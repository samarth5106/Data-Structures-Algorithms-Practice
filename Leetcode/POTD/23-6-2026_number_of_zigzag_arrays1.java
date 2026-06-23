import java.util.Arrays;

class Solution {
    private static final int MOD=1000000007;

    public int zigZagArrays(int n,int l,int r) {
        int m=r-l+1;
        int[] dp0=new int[m];
        int[] dp1=new int[m];
        
        // Base case: For length 1, each element has exactly 1 way to start
        Arrays.fill(dp0,1);
        Arrays.fill(dp1,1);

        for(int i=2;i<=n;i++){
            int[] nextDp0=new int[m];
            int[] nextDp1=new int[m];

            // 1. Calculate nextDp0 (Current step is an INCREASE -> prev < j)
            int prefSum=0;
            for(int j=0;j<m;j++){
                if(j>0){
                    nextDp0[j]=prefSum;
                }
                // For length 2, any start is valid. For length > 2, must follow a decrease (dp1).
                int val=(i==2)?dp0[j]:dp1[j];
                prefSum=(prefSum+val)%MOD;
            }

            // 2. Calculate nextDp1 (Current step is a DECREASE -> prev > j)
            int suffSum=0;
            for(int j=m-1;j>=0;j--){
                if(j+1<m){
                    nextDp1[j]=suffSum;
                }
                // For length 2, any start is valid. For length > 2, must follow an increase (dp0).
                int val=(i==2)?dp1[j]:dp0[j];
                suffSum=(suffSum+val)%MOD;
            }

            dp0=nextDp0;
            dp1=nextDp1;
        }

        // Sum up all combinations at length n
        int res=0;
        for(int j=0;j<m;j++){
            res=(res+dp0[j])%MOD;
            res=(res+dp1[j])%MOD;
        }

        return res;
    }
}
