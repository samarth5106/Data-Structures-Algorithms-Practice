class Solution {
    public int countKdivPairs(int[] arr, int k) {
        int[] freq = new int[k];
        for (int x : arr) {
            freq[x % k]++;
        }
        
        int count = 0;
        
        // remainder 0 wale apas me pair karenge: nC2
        count += (freq[0] * (freq[0] - 1)) / 2;
        
        // remainder r aur k-r wale pair karenge (r < k-r taaki double count na ho)
        for (int r = 1; r <= k / 2; r++) {
            if (r != k - r) {
                count += freq[r] * freq[k - r];
            }
        }
        
        // agar k even hai, to k/2 wala remainder khud ke sath pair karega
        if (k % 2 == 0) {
            count += (freq[k / 2] * (freq[k / 2] - 1)) / 2;
        }
        
        return count;
    }
}
