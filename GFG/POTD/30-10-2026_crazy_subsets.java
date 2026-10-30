class Solution {
    public int cntSubsets(int[] arr, int l, int r) {
        int n = arr.length;
        int MOD = 1000000007;

        int[] count = new int[n + 2];
        int greaterThanNPlusOne = 0;

        for (int x : arr) {
            if (x <= n + 1) {
                count[x]++;
            } else {
                greaterThanNPlusOne++;
            }
        }

        long[] pow2 = new long[n + 1];
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        int[] suffixSum = new int[n + 3];
        for (int i = n + 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + count[i];
        }

        long prod = 1;
        long totalWays = 0;

        for (int k = 0; k <= r; k++) {
            if (k >= l) {
                int rem = (k + 1 <= n + 1 ? suffixSum[k + 1] : 0) + greaterThanNPlusOne;
                long ways = (prod * pow2[rem]) % MOD;
                totalWays = (totalWays + ways) % MOD;
            }

            if (k <= n + 1) {
                long term = (pow2[count[k]] - 1 + MOD) % MOD;
                prod = (prod * term) % MOD;
                if (prod == 0) {
                    break;
                }
            } else {
                break;
            }
        }

        return (int) totalWays;
    }
}
