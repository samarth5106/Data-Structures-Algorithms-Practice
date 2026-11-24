class Solution{
    public int minOperations(int[] nums){
        int n=nums.length;
        if(n<=2){
            return -1;
        }
        int V=2000;
        int INF=Integer.MAX_VALUE/2;

        int[][] L=new int[n][V+1];
        int[][] R=new int[n][V+1];

        for(int v=1;v<=V;v++){
            L[0][v]=Math.abs(nums[0]-v);
        }
        for(int i=1;i<n;i++){
            int best=INF;
            for(int v=1;v<=V;v++){
                if(v-1>=1){
                    best=Math.min(best,L[i-1][v-1]);
                }
                if(best>=INF){
                    L[i][v]=INF;
                }
                else{
                    L[i][v]=best+Math.abs(nums[i]-v);
                }
            }
        }

        for(int v=1;v<=V;v++){
            R[n-1][v]=Math.abs(nums[n-1]-v);
        }
        for(int i=n-2;i>=0;i--){
            int best=INF;
            for(int v=1;v<=V;v++){
                if(v-1>=1){
                    best=Math.min(best,R[i+1][v-1]);
                }
                if(best>=INF){
                    R[i][v]=INF;
                }
                else{
                    R[i][v]=best+Math.abs(nums[i]-v);
                }
            }
        }

        int ans=INF;
        for(int i=1;i<=n-2;i++){
            for(int v=1;v<=V;v++){
                if(L[i][v]>=INF||R[i][v]>=INF){
                    continue;
                }
                int total=L[i][v]+R[i][v]-Math.abs(nums[i]-v);
                ans=Math.min(ans,total);
            }
        }
        return ans>=INF?-1:ans;
    }
}
