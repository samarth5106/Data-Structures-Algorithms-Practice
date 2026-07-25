class Solution {
    public int maximumSum(int[][] mat, int k) {
        // code here
      
        if(mat.length==k){
            int sum=0;
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat.length;j++){
                    sum+=mat[i][j];
                    
                }
            }
            return sum;
        }
        
        int[][] pref=new int[mat.length+1][mat.length+1];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                pref[i+1][j+1]=mat[i][j]+pref[i][j+1]+pref[i+1][j]-pref[i][j];
            }
        }
        
        int till=mat.length-k;// row and column dono
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<=till;i++){
            for(int j=0;j<=till;j++){
                
                int r=i+k-1;
                int c=j+k-1;
               int sum = pref[r + 1][c + 1] 
                        - pref[i][c + 1]      // Subtract top region
                        - pref[r + 1][j]      // Subtract left region
                        + pref[i][j];         // Add back double-subtracted top-left overlap
                
                //maxi = Math.max(maxi, sum);
                maxi=Math.max(sum,maxi);
            }
        }
        
        return maxi;
    }
}
