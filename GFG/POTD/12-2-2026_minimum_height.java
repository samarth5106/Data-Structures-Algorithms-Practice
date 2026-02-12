class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
        int n = arr.length;
        int low = 0;
        int high = 2000000000; // Large enough upper bound
        int ans = 0;

        for (int x : arr) low = Math.min(low, x);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, w, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] arr, int k, int w, int target) {
        int n = arr.length;
        long[] diff = new long[n + 1];
        long currentWater = 0;
        long daysUsed = 0;

        for (int i = 0; i < n; i++) {
            currentWater += diff[i];
            long currentHeight = arr[i] + currentWater;

            if (currentHeight < target) {
                long needed = target - currentHeight;
                daysUsed += needed;
                
                if (daysUsed > k) return false;

                // Apply watering from i to i + w - 1
                currentWater += needed;
                if (i + w < n) {
                    diff[i + w] -= needed;
                }
            }
        }
        return daysUsed <= k;
    }
}
