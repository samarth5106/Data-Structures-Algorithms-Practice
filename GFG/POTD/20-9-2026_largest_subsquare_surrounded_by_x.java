class Solution {
    public int largestSubsquare(char[][] mat) {
        int n = mat.length;
        if (n == 0) return 0;
        
        int[][] left = new int[n][n];
        int[][] right = new int[n][n];
        int[][] up = new int[n][n];
        int[][] down = new int[n][n];
        
        // left: row-wise, left to right
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 'X') {
                    left[i][j] = (j == 0) ? 1 : left[i][j-1] + 1;
                } else {
                    left[i][j] = 0;
                }
            }
        }
        
        // right: row-wise, right to left
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (mat[i][j] == 'X') {
                    right[i][j] = (j == n-1) ? 1 : right[i][j+1] + 1;
                } else {
                    right[i][j] = 0;
                }
            }
        }
        
        // up: column-wise, top to bottom
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (mat[i][j] == 'X') {
                    up[i][j] = (i == 0) ? 1 : up[i-1][j] + 1;
                } else {
                    up[i][j] = 0;
                }
            }
        }
        
        // down: column-wise, bottom to top
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= 0; i--) {
                if (mat[i][j] == 'X') {
                    down[i][j] = (i == n-1) ? 1 : down[i+1][j] + 1;
                } else {
                    down[i][j] = 0;
                }
            }
        }
        
        int ans = 0;
        
        // har top-left corner (r,c) aur possible size k try karo
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int maxPossibleK = Math.min(n - r, n - c); // matrix ke andar fit hona chahiye
                for (int k = maxPossibleK; k >= 1; k--) {
                    int rr = r + k - 1, cc = c + k - 1;
                    if (right[r][c] >= k && right[rr][c] >= k &&
                        down[r][c] >= k && down[r][cc] >= k) {
                        ans = Math.max(ans, k);
                        break; // is (r,c) ke liye best k mil gaya, aage chhote k check karne ki zaroorat nahi
                    }
                }
            }
        }
        
        return ans;
    }
}
