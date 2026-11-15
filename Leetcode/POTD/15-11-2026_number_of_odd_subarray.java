class Solution {
    public int numOfSubarrays(int[] arr) {
        //odd= odd+even 
        //odd = even +odd

        //if all even = then 0
        // sum of odd number of odds is odd
        // sum of even number of odds is even
        // all subarray sum if odd, store/ or increse count
        // n^2
        //prefx sum
         final int MOD = 1_000_000_007;
        long odd = 0, even = 0, ans = 0;

        for (int x : arr) {
            if (x % 2 == 1) {
                long newOdd = even + 1;
                long newEven = odd;
                odd = newOdd;
                even = newEven;
            } else {
                even = even + 1;
            }
            ans = (ans + odd) % MOD;
        }

        return (int) ans;






    }
}
