class Solution {
    
    public int maxDotProduct(int[] a, int[] b) {
        // code here
       int ans=0;
      
       if(a.length==b.length){
           for(int i=0;i<a.length;i++){
               ans+=(a[i]*b[i]);
           }
       }
       
       else {
           int neeed=a.length-b.length;
            //int[][][] dp=new int[a.length+1][b.length+1][neeed+1];
            int[][] ahead=new int[b.length+1][neeed+1];
            int[][] curr=new int[b.length+1][neeed+1];
            for(int i= a.length-1;i>=0;i--){
                for(int j=b.length-1;j>=0;j--){
                    for(int need=0;need<=neeed;need++){
                            int gzro=0;
                            int nzo=0;
                            if(need!=0)
                             gzro=0+ahead[j][need-1];
            
                            nzo=(a[i]*b[j])+ahead[j+1][need];
                             curr[j][need]=Math.max(gzro,nzo);
                    }
                    
                }
                int[][] temp = ahead;
            ahead = curr;
            curr = temp;
            }
         
          ans=ahead[0][neeed];
       }
       
        return ans;
    }
}
