class Solution {
    private final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private int dfs(int r, int c, int[][] matrix, int[][] memo, int n, int m) {
        if (memo[r][c] != 0) {
            return memo[r][c];
        }

        int maxLen = 1;

        for (int[] dir : dirs) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr >= 0 && nr < n && nc >= 0 && nc < m && matrix[nr][nc] > matrix[r][c]) {
                maxLen = Math.max(maxLen, 1 + dfs(nr, nc, matrix, memo, n, m));
            }
        }

        return memo[r][c] = maxLen;
    }

    public int longIncPath(int[][] matrix, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        int[][] memo = new int[n][m];
        int longest = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                longest = Math.max(longest, dfs(i, j, matrix, memo, n, m));
            }
        }

        return longest;
    }
}
