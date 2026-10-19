class Solution {
    public int goodIndices(int[] arr) {
        int n = arr.length;
        int[] status = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (status[i] == 0) {
                dfs(i, arr, status);
            }
            if (status[i] == 2) {
                count++;
            }
        }
        return count;
    }

    private int dfs(int i, int[] arr, int[] status) {
        if (i < 0 || i >= arr.length) {
            return 2;
        }

        if (status[i] != 0) {
            return status[i];
        }

        if (arr[i] == 0) {
            status[i] = 1;
            return 1;
        }

        status[i] = 1;
        int nextIdx = i + arr[i];
        status[i] = dfs(nextIdx, arr, status);
        return status[i];
    }
}
