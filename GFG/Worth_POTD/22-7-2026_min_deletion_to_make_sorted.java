import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minDeletions(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;

        // tails[i] stores the smallest tail of all increasing subsequences of length i + 1
        List<Integer> tails = new ArrayList<>();

        for (int x : arr) {
            int idx = binarySearch(tails, x);

            if (idx == tails.size()) {
                // x is greater than all elements in tails, extend the sequence
                tails.add(x);
            } else {
                // Replace the first element >= x to maintain the smallest tail
                tails.set(idx, x);
            }
        }

        int lisLength = tails.size();
        return n - lisLength;
    }

    // Finds the first index in tails with value >= target (Lower Bound)
    private int binarySearch(List<Integer> tails, int target) {
        int low = 0, high = tails.size() - 1;
        int ans = tails.size();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (tails.get(mid) >= target) {
                ans = mid;
                high = mid - 1; // Search left for lower bound
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
