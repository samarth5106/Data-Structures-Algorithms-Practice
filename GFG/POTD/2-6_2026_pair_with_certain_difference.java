class Solution {
    public int sumDiffPairs(int[] arr, int k) {
        Arrays.sort(arr);
        int ans=0;
        int i=arr.length-1;
        while(i>0){
            if(arr[i]-arr[i-1]<k){
                ans+=arr[i]+arr[i-1];
                i-=2;
            }else{
                i--;
            }
        }
        return ans;
    }
}
