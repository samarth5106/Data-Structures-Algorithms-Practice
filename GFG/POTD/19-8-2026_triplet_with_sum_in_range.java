import java.util.Arrays;

class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        Arrays.sort(arr);
        return countTripletsLessOrEqual(arr, r) - countTripletsLessOrEqual(arr, l - 1);
    }

    private int countTripletsLessOrEqual(int[] arr, int target) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;


            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum <= target) {
                    // If sum <= target, all pairs from 'left' to 'right' 
                    // will satisfy the condition with arr[i] and arr[left]
                    count += (right - left);
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
