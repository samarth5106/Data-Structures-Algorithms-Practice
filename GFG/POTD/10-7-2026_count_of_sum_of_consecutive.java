class Solution {
    public int getCount(int n) {
        int cnt = 0;
        
        // k represents the number of consecutive elements. 
        // We start from 2 because the problem specifies '2 or more' consecutive numbers.
        for (int k = 2; (k * (k - 1)) / 2 < n; k++) {
            int numerator = n - (k * (k - 1)) / 2;
            
            // If the numerator is perfectly divisible by k, a valid 'a' exists
            if (numerator % k == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}
