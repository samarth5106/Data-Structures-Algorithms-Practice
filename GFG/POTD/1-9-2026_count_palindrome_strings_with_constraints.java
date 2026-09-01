class Solution {
    public int palindromicStrings(int n, int k) {
        final int MOD = 1_000_000_007;
        int limit = Math.min(n, 2 * k + 1); // isse aage saare terms 0 honge

        long perm = 1;   // P(k, 0) = 1  (0 characters choose karne ka 1 hi tareeka - khaali)
        int prevH = 0;
        long total = 0;

        for (int L = 1; L <= limit; L++) {
            int h = L / 2; // half string ki length (integer division)

            if (h > prevH) {
                // perm ko P(k, h-1) se P(k, h) tak upgrade karo
                if (h <= k) {
                    perm = (perm * (k - h + 1)) % MOD;
                } else {
                    perm = 0;
                }
                prevH = h;
            }

            long term;
            if (h > k) {
                term = 0;
            } else if (L % 2 == 0) {
                term = perm;
            } else {
                term = (perm * (k - h)) % MOD;
            }

            total = (total + term) % MOD;
        }

        return (int) total;
    }
}
