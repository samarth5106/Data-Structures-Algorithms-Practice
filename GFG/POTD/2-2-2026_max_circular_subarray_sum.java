class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
         int n=arr.length;
        int curMax=arr[0],maxSum=arr[0];
        int curMin=arr[0],minSum=arr[0];
        int tot=arr[0];
        for(int i=1;i<n;i++){
            curMax=Math.max(arr[i],curMax+arr[i]);
            maxSum=Math.max(maxSum,curMax);
            curMin=Math.min(arr[i],curMin+arr[i]);
            minSum=Math.min(minSum,curMin);
            tot+=arr[i];
        }
        if(maxSum<0)return maxSum;
        return Math.max(maxSum,tot-minSum);
    }
}
