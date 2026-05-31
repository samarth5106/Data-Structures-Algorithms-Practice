class Solution {
    public int maxJump(int[] stones) {
        // Base Case: Agar sirf 2 hi stones hain, toh direct jump lagani padegi
        if (stones.length == 2) return stones[1] - stones[0];
        
        int maxi = 0;
        
        // Pure array me har alternate stone ka gap check karo (i aur i-2)
        for (int i = 2; i < stones.length; i++) {
            maxi = Math.max(maxi, stones[i] - stones[i - 2]);
        }
        
        return maxi;
    }
}
