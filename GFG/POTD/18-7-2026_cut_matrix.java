class Solution {
    public int findWays(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int MOD = (int) 1e9 + 7;

        // 1. 2D Prefix Sum to count '1's in O(1)
        int[][] prefixSum = new int[n + 1][m + 1];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                prefixSum[r + 1][c + 1] = matrix[r][c] 
                                        + prefixSum[r][c + 1] 
                                        + prefixSum[r + 1][c] 
                                        - prefixSum[r][c];
            }
        }

        // Helper matrix to easily find number of 1s in bottom-right submatrix
        int[][] onesRemaining = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                onesRemaining[i][j] = prefixSum[n][m] 
                                    - prefixSum[i][m] 
                                    - prefixSum[n][j] 
                                    + prefixSum[i][j];
            }
        }

        // DP state arrays
        int[][] nextDp = new int[n][m];

        // Base case setup: jahan bache hue grid mein kam se kam ek '1' hai
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (onesRemaining[i][j] > 0) {
                    nextDp[i][j] = 1;
                }
            }
        }

        // 2. Optimized DP transitions
        for (int ck = k - 2; ck >= 0; ck--) {
            int[][] currentDp = new int[n][m];
            
            // Suffix sum arrays to optimize the inner loops to O(1)
            int[][] suffixSumRow = new int[n + 1][m];
            int[][] suffixSumCol = new int[n][m + 1];
            
            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    suffixSumRow[i][j] = (nextDp[i][j] + suffixSumRow[i + 1][j]) % MOD;
                    suffixSumCol[i][j] = (nextDp[i][j] + suffixSumCol[i][j + 1]) % MOD;
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int j = m - 1; j >= 0; j--) {
                    if (onesRemaining[i][j] == 0) continue;

                    long totalWays = 0;

                    // A) Horizontal Cuts Optimization:
                    // Pehla valid 'r' dhoondhne ke liye binary search ya linear scan ki zarurat nahi, 
                    // kyunki hume pata hai ki pehla '1' kahan aa raha hai.
                    int firstValidRow = i;
                    while (firstValidRow < n - 1 && onesRemaining[i][j] - onesRemaining[firstValidRow + 1][j] == 0) {
                        firstValidRow++;
                    }
                    if (firstValidRow < n - 1) {
                        // Suffix sum ki madad se pure range ka sum O(1) mein nikala
                        totalWays = (totalWays + suffixSumRow[firstValidRow + 1][j]) % MOD;
                    }

                    // B) Vertical Cuts Optimization:
                    int firstValidCol = j;
                    while (firstValidCol < m - 1 && onesRemaining[i][j] - onesRemaining[i][firstValidCol + 1] == 0) {
                        firstValidCol++;
                    }
                    if (firstValidCol < m - 1) {
                        // Suffix sum ki madad se pure range ka sum O(1) mein nikala
                        totalWays = (totalWays + suffixSumCol[i][firstValidCol + 1]) % MOD;
                    }

                    currentDp[i][j] = (int) totalWays;
                }
            }
            nextDp = currentDp;
        }

        return nextDp[0][0];
    }
}
