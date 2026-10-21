class Solution {
    static int minSubarraySum(int[] arr) {
        int minEndingHere = arr[0];
        int minSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            minEndingHere = Math.min(arr[i], minEndingHere + arr[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        return minSoFar;
    }
}
