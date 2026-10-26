class Solution {
    public int minDiff(int k, int[] arr) {
        int n = arr.length;
        if (k >= n) return 0;
        if (k == 0) {
            int mn = arr[0], mx = arr[0];
            for (int x : arr) {
                mn = Math.min(mn, x);
                mx = Math.max(mx, x);
            }
            return mx - mn;
        }

        int[] prefMin = new int[n];
        int[] prefMax = new int[n];
        int[] suffMin = new int[n];
        int[] suffMax = new int[n];

        prefMin[0] = arr[0];
        prefMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefMin[i] = Math.min(prefMin[i - 1], arr[i]);
            prefMax[i] = Math.max(prefMax[i - 1], arr[i]);
        }

        suffMin[n - 1] = arr[n - 1];
        suffMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffMin[i] = Math.min(suffMin[i + 1], arr[i]);
            suffMax[i] = Math.max(suffMax[i + 1], arr[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int j = i + k - 1;
            int curMin = Integer.MAX_VALUE;
            int curMax = Integer.MIN_VALUE;

            if (i > 0) {
                curMin = Math.min(curMin, prefMin[i - 1]);
                curMax = Math.max(curMax, prefMax[i - 1]);
            }
            if (j < n - 1) {
                curMin = Math.min(curMin, suffMin[j + 1]);
                curMax = Math.max(curMax, suffMax[j + 1]);
            }

            ans = Math.min(ans, curMax - curMin);
        }

        return ans;
    }
}
