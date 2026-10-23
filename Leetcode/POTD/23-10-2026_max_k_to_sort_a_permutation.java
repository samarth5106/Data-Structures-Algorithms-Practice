class Solution {
    public int sortPermutation(int[] nums) {
        int ans = -1; // -1 represents all 1-bits in two's complement

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                if (ans == -1) {
                    ans = nums[i];
                } else {
                    ans &= nums[i];
                }
            }
        }

        // If ans was never modified, nums is already sorted -> return 0
        return ans == -1 ? 0 : ans;
    }
}
