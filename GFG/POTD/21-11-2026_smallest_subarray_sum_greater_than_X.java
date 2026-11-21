class Solution {
    public int smallestSubWithSum(int[] arr, int x) {
        // code here
        int len=Integer.MAX_VALUE;
        int l=0;
        int r=l;
        int sum=0;
        while(r<arr.length){
            sum+=arr[r];
           while(sum>x){
               len=Math.min(len,r-l+1);
               sum-=arr[l];
               l++;
           }
            r++;
            
        }
        if(len==Integer.MAX_VALUE) return 0;
        return len;
    }
}
