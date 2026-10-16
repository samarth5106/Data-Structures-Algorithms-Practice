class Solution {
    public int countAlwaysFound(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;

        // rightMin[i] stores the minimum value in nums[i+1 ... n-1]
        int[] rightMin = new int[n];
        rightMin[n - 1] = Integer.MAX_VALUE;

        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i + 1]);
        }

        int count = 0;
        int leftMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > leftMax && nums[i] < rightMin[i]) {
                count++;
            }
            leftMax = Math.max(leftMax, nums[i]);
        }

        return count;
    }
}
