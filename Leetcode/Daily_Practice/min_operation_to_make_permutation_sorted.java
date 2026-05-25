class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        
        // Find where the 0 is located
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                idx = i;
                break;
            }
        }
        
        // Check Circularly Ascending
        boolean circasc = true;
        for (int i = 0; i < n; i++) {
            int expected = (nums[i] + 1) % n;
            if (nums[(i + 1) % n] != expected) {
                circasc = false; 
                break;
            }
        }
        
        // Check Circularly Descending
        boolean circdec = true;
        for (int i = 0; i < n; i++) {
            int expected = (nums[i] - 1 + n) % n;
            if (nums[(i + 1) % n] != expected) {
                circdec = false; 
                break;
            }
        }
        
        if (!circasc && !circdec) return -1;
        
        if (circasc) {
            // Option 1: Pure left rotations (idx)
            // Option 2: Reverse, rotate other way, reverse back ((n - idx) + 2)
            return Math.min(idx, (n - idx) + 2);
        } else {
            // Option 1: Reverse first, then rotate (n - idx)
            // Option 2: Rotate first, then reverse (idx + 2)
            return Math.min(n - idx, idx + 2);
        }
    }
}
