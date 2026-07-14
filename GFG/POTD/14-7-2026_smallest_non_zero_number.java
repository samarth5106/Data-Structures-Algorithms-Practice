class Solution {
    public int find(int[] arr) {
        // code here
        //x>ar[i] x+=(x-arr[i])
        //x<=arr[i] x-=(arr[i]-x)
        
        // max value of x-> largest elmnt 
         int n = arr.length;
        long required = 0; // sabse peeche wala threshold, initially 0
        
        for (int i = n - 1; i >= 0; i--) {
            long sum = required + arr[i];
            required = (sum + 1) / 2;  // ceiling division for non-negative numbers
        }
        
        return (int) required;
    }
}
