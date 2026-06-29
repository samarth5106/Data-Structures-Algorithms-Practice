class Solution {
    int solve(int i,int need,int[] a,int[] b,int j,int[][][] dp){
        if(i>=a.length) return 0;
        if(j>=b.length) return 0;
        
        if(dp[i][j][need]!=-1) return dp[i][j][need];
        int gzro=0;
        int nzo=0;
            if(need!=0){
                gzro=0+solve(i+1,need-1,a,b,j,dp);
            }
            nzo=(a[i]*b[j])+solve(i+1,need,a,b,j+1,dp);
        
        return dp[i][j][need]=Math.max(gzro,nzo);
    
    }
    
    public int maxDotProduct(int[] a, int[] b) {
        // code here
       int ans=0;
      
       if(a.length==b.length){
           for(int i=0;i<a.length;i++){
               ans+=(a[i]*b[i]);
           }
       }
       
       else {
           int j=0;
           int need=a.length-b.length;
            int[][][] dp=new int[a.length][b.length][need+1];
            for(int i=0;i<a.length;i++){
                for(int k=0;k<b.length;k++){
                    Arrays.fill(dp[i][k],-1);
                }
            }
         
          ans=solve(0,need,a,b,j,dp);
       }
       
        return ans;
    }
}
