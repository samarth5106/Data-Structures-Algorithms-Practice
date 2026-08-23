import java.util.*;

class Solution {
    public int numberOfCells(int r, int c, int u, int d, char[][] mat) {
        if (mat[r][c] != '.') return 0;

        int n = mat.length, m = mat[0].length;

        int[][] minUp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(minUp[i], Integer.MAX_VALUE);
        }

        minUp[r][c] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r, c});

        int[] dr = {-1, 1, 0, 0}; // up, down, left, right
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + dr[k];
                int ny = y + dc[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (mat[nx][ny] == '#') continue;

                int newUp = minUp[x][y];

                // moving up (row decreases)
                if (nx < x) {
                    newUp++;
                }
                if (newUp > u) continue; // up budget exceed ho gaya, prune

                if (newUp < minUp[nx][ny]) {
                    minUp[nx][ny] = newUp;
                    q.offer(new int[]{nx, ny});
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (minUp[i][j] == Integer.MAX_VALUE) continue;
                int up = minUp[i][j];
                int down = up + i - r;
                if (down <= d) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
