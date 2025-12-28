import java.util.Arrays;
class Solution {
    public int kthSmallest(int[][] mat, int k) {
        // code here
       
       PriorityQueue<int[]> pq=new PriorityQueue<>(
           (a,b)->a[0]-b[0]
           );
           int n=mat.length;
           
      for(int i=0;i<n;i++){
          pq.add(new int[]{mat[i][0],i,0});
      }
      int ans=0;
      int r=0,c=0;
      while(k-->0){
          int[] currnt=pq.poll();
          ans=currnt[0];
          r=currnt[1];
          c=currnt[2];
          if(c+1<n)
          pq.add(new int[]{mat[r][c+1],r,c+1});
          
      }
      return ans;
       
       
    }
}
