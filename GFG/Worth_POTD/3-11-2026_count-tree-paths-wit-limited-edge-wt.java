import java.util.*;

class Solution {

    int[] parent;
    int[] size;

    // Find the ultimate parent
    int find(int x) {
        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    // Merge two components and count newly formed paths
    long union(int u, int v, long ans) {

        int pu = find(u);
        int pv = find(v);

        // Already in the same component
        if (pu == pv) return ans;

        // Number of new paths formed
        ans += (long) size[pu] * size[pv];

        // Union by size
        if (size[pu] < size[pv]) {
            int temp = pu;
            pu = pv;
            pv = temp;
        }

        parent[pv] = pu;
        size[pu] += size[pv];

        return ans;
    }

    public ArrayList<Integer> maximumWeight(
        int n, int[][] edges, int[] queries) {

        parent = new int[n + 1];
        size = new int[n + 1];

        // Initially, every node is an independent component
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // Step 1: Sort edges according to weight
        Arrays.sort(edges, (a, b) ->
            Integer.compare(a[2], b[2])
        );

        // Step 2: Store queries with their original indices
        int[][] q = new int[queries.length][2];

        for (int i = 0; i < queries.length; i++) {
            q[i][0] = queries[i];
            q[i][1] = i;
        }

        // Step 3: Sort queries by their limits
        Arrays.sort(q, (a, b) ->
            Integer.compare(a[0], b[0])
        );

        long[] result = new long[queries.length];

        int j = 0;
        long ans = 0;

        // Step 4: Process queries in increasing order
        for (int i = 0; i < queries.length; i++) {

            int limit = q[i][0];

            // Add all edges whose weight <= current query
            while (j < edges.length &&
                   edges[j][2] <= limit) {

                ans = union(
                    edges[j][0],
                    edges[j][1],
                    ans
                );

                j++;
            }

            // Store answer at original query index
            result[q[i][1]] = ans;
        }

        // Step 5: Convert result into ArrayList
        ArrayList<Integer> res = new ArrayList<>();

        for (long val : result) {
            res.add((int) val);
        }

        return res;
    }
}
