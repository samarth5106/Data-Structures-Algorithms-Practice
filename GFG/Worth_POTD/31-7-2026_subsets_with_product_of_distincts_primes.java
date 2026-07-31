import java.util.*;

class Solution {

    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    int MOD = (int) 1e9 + 7;

    int getMask(int val) {
        int mask = 0;
        for (int i = 0; i < 10; i++) {
            int p = primes[i];
            if (val % (p * p) == 0) return -1;
            if (val % p == 0) mask |= (1 << i);
        }
        return mask;
    }

    public int countSubsets(int[] arr) {
        int[] freq = new int[31];
        for (int x : arr) freq[x]++;

        // dp[mask] = number of valid subsets with given prime mask
        long[] dp = new long[1024];
        dp[0] = 1;

        for (int num = 2; num <= 30; num++) {
            if (freq[num] == 0) continue;
            int numMask = getMask(num);
            if (numMask == -1) continue; // Skip numbers with square factors like 4, 9, 12...

            long count = freq[num];
            long[] nextDp = dp.clone();

            for (int mask = 0; mask < 1024; mask++) {
                if ((mask & numMask) == 0) { // No shared prime factors
                    nextDp[mask | numMask] = (nextDp[mask | numMask] + dp[mask] * count) % MOD;
                }
            }
            dp = nextDp;
        }

        // Sum up all subsets with at least one prime factor (mask > 0)
        long totalSubsets = 0;
        for (int mask = 1; mask < 1024; mask++) {
            totalSubsets = (totalSubsets + dp[mask]) % MOD;
        }

        // Account for occurrences of 1: each 1 doubles the subset choices (2^freq[1])
        long onesMultiplier = 1;
        for (int i = 0; i < freq[1]; i++) {
            onesMultiplier = (onesMultiplier * 2) % MOD;
        }

        return (int) ((totalSubsets * onesMultiplier) % MOD);
    }
}
