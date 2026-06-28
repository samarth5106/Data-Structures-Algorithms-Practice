class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int ans;
        if(arr[0]!=1){
            arr[0]=1;
        }
        int maxi=1;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])>=2){
                arr[i]=arr[i-1]+1;
            }
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
