import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> update(int n, int[] updates) {
        int[] arr = new int[n];

        // Mark the start of each range update
        for (int val : updates) {
            if (val <= n) {
                arr[val - 1]++;
            }
        }

        // Propagate the updates using prefix sum
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        // Convert to ArrayList
        ArrayList<Integer> result = new ArrayList<>(n);
        for (int num : arr) {
            result.add(num);
        }

        return result;
    }
}
