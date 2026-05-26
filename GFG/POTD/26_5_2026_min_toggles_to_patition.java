class Solution {
    public int minToggle(int[] arr) {
        int n = arr.length;
        
        int zeroCount = 0;
        for (int num : arr) {
            if (num == 0) zeroCount++;
        }
        
        int currentToggles = zeroCount;
        int minToggles = currentToggles;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                currentToggles--;
            } else {
                currentToggles++;
            }
            minToggles = Math.min(minToggles, currentToggles);
        }
        
        return minToggles;
    }
}
