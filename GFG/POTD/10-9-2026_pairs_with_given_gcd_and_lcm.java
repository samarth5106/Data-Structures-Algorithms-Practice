class Solution {
    public int pairCount(int x, int y) {
        if (y % x != 0) return 0;

        int m = y / x;
        int distinctPrimeFactors = 0;

        int temp = m;
        for (int p = 2; (long) p * p <= temp; p++) {
            if (temp % p == 0) {
                distinctPrimeFactors++;
                while (temp % p == 0) {
                    temp /= p;
                }
            }
        }
        if (temp > 1) distinctPrimeFactors++; // बचा हुआ prime factor

        return 1 << distinctPrimeFactors; // 2^k
    }
}
