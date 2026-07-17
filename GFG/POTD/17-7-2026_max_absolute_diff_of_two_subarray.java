class Solution {
    public int maxDiffSubArrays(int[] arr) {
        // code here
        int n = arr.length;
        
        // Kadane's algorithm for max/min subarray sum
        int[] maxLeft = new int[n];
        int[] minLeft = new int[n];
        
        int maxSum = arr[0], minSum = arr[0];
        int currentMax = arr[0], currentMin = arr[0];
        
        maxLeft[0] = maxSum;
        minLeft[0] = minSum;
        
        for(int i = 1; i < n; i++){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
            maxLeft[i] = maxSum;
            
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);
            minLeft[i] = minSum;
        }
        
        // Right side
        int[] maxRight = new int[n];
        int[] minRight = new int[n];
        
        maxSum = arr[n-1];
        minSum = arr[n-1];
        currentMax = arr[n-1];
        currentMin = arr[n-1];
        
        maxRight[n-1] = maxSum;
        minRight[n-1] = minSum;
        
        for(int i = n-2; i >= 0; i--){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);
            maxRight[i] = maxSum;
            
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);
            minRight[i] = minSum;
        }
        
        // Find max difference
        int result = 0;
        for(int i = 0; i < n-1; i++){
            int diff1 = Math.abs(maxLeft[i] - minRight[i+1]);
            int diff2 = Math.abs(minLeft[i] - maxRight[i+1]);
            result = Math.max(result, Math.max(diff1, diff2));
        }
        
        return result;
        
    }
}
