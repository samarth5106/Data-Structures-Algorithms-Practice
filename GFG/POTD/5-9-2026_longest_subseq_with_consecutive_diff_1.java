class Solution {
    public int longestSubseq(int[] arr) {
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLen = 1;
        
        for (int val : arr) {
            int left = dp.getOrDefault(val - 1, 0);
            int right = dp.getOrDefault(val + 1, 0);
            int cur = Math.max(left, right) + 1;
            
            dp.put(val, cur); // update/overwrite karo current value ke liye
            maxLen = Math.max(maxLen, cur);
        }
        
        return maxLen;
    }
}
