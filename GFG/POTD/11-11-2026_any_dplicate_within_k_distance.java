import java.util.HashSet;

class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // If the element already exists in the window of size k
            if (set.contains(arr[i])) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);

            // Maintain the window size at most k
            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }

        return false;
    }
}
