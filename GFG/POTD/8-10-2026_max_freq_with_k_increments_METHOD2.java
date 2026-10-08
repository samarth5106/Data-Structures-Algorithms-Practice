class Solution {
    public int maxFrequency(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int l=0;
        int r=l;
        int total_sum=0;
        int target_sum=0;
        int maxi=0;
        
        while(r<arr.length){
            total_sum+=arr[r];
            target_sum=(r-l+1)*arr[r];
          int operations=target_sum-total_sum;
          if(operations<=k){
              maxi=Math.max(maxi,r-l+1);
          }
          else{
              
              total_sum-=arr[l];
              l++;
          }
          r++;
            
        }
        return maxi;
        
        
    }
}
