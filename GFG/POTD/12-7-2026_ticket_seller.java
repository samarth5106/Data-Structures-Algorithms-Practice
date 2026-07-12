class Solution {
    public int maxAmount(int[] arr, int k) {
        // code here
        int MOD=(int)1e9+7;
       
        int ans=0;
        int i=arr.length-1;
      PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
      for(int tic:arr){
          maxheap.add(tic);
      }
      while(k-->0){
          int val=maxheap.poll();
          ans=(ans+val)%MOD;
          if(val==0){
              break;
          }
          maxheap.add(val-1);
          
      }
     
      return ans;
    }
}
