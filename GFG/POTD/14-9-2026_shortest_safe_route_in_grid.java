class Solution{
int shortestPath(int[][] mat) {
    int n = mat.length, m = mat[0].length;
    int[] dr = {-1,0,1,0}, dc = {0,1,0,-1};

    // Step 1: mark unsafe cells (fix from Bug 1 above) — don't mutate original 0s
    boolean[][] unsafe = new boolean[n][m];
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            if (mat[i][j] == 0) {
                unsafe[i][j] = true;
                for (int k = 0; k < 4; k++) {
                    int nr=i+dr[k], nc=j+dc[k];
                    if (nr>=0 && nr<n && nc>=0 && nc<m) unsafe[nr][nc] = true;
                }
            }

    // Step 2: multi-source BFS from all safe cells in leftmost column
    int[][] dist = new int[n][m];
    for (int[] row : dist) Arrays.fill(row, -1);
    Queue<int[]> q = new LinkedList<>();
    for (int i = 0; i < n; i++) {
        if (!unsafe[i][0]) {
            dist[i][0] = 1;          // 1 cell traversed so far
            q.offer(new int[]{i, 0});
        }
    }

    while (!q.isEmpty()) {
        int[] cur = q.poll();
        int i = cur[0], j = cur[1];
        if (j == m - 1) return dist[i][j];   // pehla rightmost-column hit hi shortest hoga
        for (int k = 0; k < 4; k++) {
            int ni=i+dr[k], nj=j+dc[k];
            if (ni>=0 && ni<n && nj>=0 && nj<m && !unsafe[ni][nj] && dist[ni][nj]==-1) {
                dist[ni][nj] = dist[i][j] + 1;
                q.offer(new int[]{ni, nj});
            }
        }
    }
    return -1;
}
}
