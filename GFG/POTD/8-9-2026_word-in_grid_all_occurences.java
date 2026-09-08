class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        int len = word.length();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != word.charAt(0)) continue;

            
                for (int d = 0; d < 8; d++) {
                    int nr = i + dr[d];
                    int nc = j + dc[d];
                    int k = 1;

                    while (k < len) {
                        if (nr < 0 || nc < 0 || nr >= n || nc >= m || mat[nr][nc] != word.charAt(k)) {
                            break;
                        }
                        nr += dr[d];
                        nc += dc[d];
                        k++;
                    }

                    if (k == len) {
                        ans.add(new ArrayList<>(Arrays.asList(i, j)));
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
