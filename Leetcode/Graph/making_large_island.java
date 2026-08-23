import java.util.*;

class Solution {

    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    // ek island ko BFS se explore karke usko id de deta hai aur size return karta hai
    int labelIsland(int r, int c, int[][] grid, int[][] islandId, int id) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        islandId[r][c] = id;
        int size = 1;

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];

                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length
                        && grid[nr][nc] == 1 && islandId[nr][nc] == 0) {
                    islandId[nr][nc] = id;
                    size++;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return size;
    }

    public int largestIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int[][] islandId = new int[n][m]; // 0 = unassigned, warna island ka id
        Map<Integer, Integer> islandSize = new HashMap<>();

        int id = 1;
        int maxi = 0;
        boolean hasZero = false;

        // Pass 1: sabhi islands ko label karo, unka size store karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && islandId[i][j] == 0) {
                    int size = labelIsland(i, j, grid, islandId, id);
                    islandSize.put(id, size);
                    maxi = Math.max(maxi, size);
                    id++;
                }
                if (grid[i][j] == 0) hasZero = true;
            }
        }

        if (!hasZero) return n * m; // poora grid already 1 hai

        // Pass 2: har 0 cell ke liye, uske connected unique islands ka sum nikaalo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) continue;

                Set<Integer> seenIds = new HashSet<>();
                int total = 1; // khud is cell ke liye (0 -> 1 banne ke baad)

                for (int k = 0; k < 4; k++) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];
                    if (nr >= 0 && nc >= 0 && nr < n && nc < m && grid[nr][nc] == 1) {
                        int nid = islandId[nr][nc];
                        if (!seenIds.contains(nid)) {
                            seenIds.add(nid);
                            total += islandSize.get(nid);
                        }
                    }
                }

                maxi = Math.max(maxi, total);
            }
        }

        return maxi;
    }
}
