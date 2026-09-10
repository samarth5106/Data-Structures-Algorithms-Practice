class pair {
    int nd;
    int lv;

    pair(int nd, int lv) {
        this.nd = nd;
        this.lv = lv;
    }
}

class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] visited = new int[n];
        int[] parent = new int[n];
        int[] level = new int[n];

        Arrays.fill(parent, -1);

        Queue<pair> q = new LinkedList<>();

        q.add(new pair(0, 0));
        visited[0] = 1;
        parent[0] = -1;

        int sum = 0;

        // BFS
        while (!q.isEmpty()) {

            pair pr = q.remove();

            int node = pr.nd;
            int lv = pr.lv;

            level[node] = lv;
            sum += lv;

            for (int j = 0; j < adj.get(node).size(); j++) {

                int nei = adj.get(node).get(j);

                if (visited[nei] == 0) {

                    visited[nei] = 1;
                    parent[nei] = node;

                    q.add(new pair(nei, lv + 1));
                }
            }
        }

        int[] ans = new int[n];

        ans[0] = sum;

        // subtree size
        int[] subtree = new int[n];
        Arrays.fill(subtree, 1);

        /*
           Process nodes from bottom to top.
           Since every child has a greater level than its parent,
           this guarantees children are processed first.
        */
        Integer[] order = new Integer[n];

        for (int i = 0; i < n; i++)
            order[i] = i;

        Arrays.sort(order, (a, b) -> Integer.compare(level[b], level[a]));

        for (int i = 0; i < n; i++) {

            int node = order[i];

            if (parent[node] != -1) {
                subtree[parent[node]] += subtree[node];
            }
        }

        /*
           Now calculate answers from parent to child.
           Process nodes from top to bottom.
        */
        Arrays.sort(order, (a, b) -> Integer.compare(level[a], level[b]));

        for (int i = 1; i < n; i++) {

            int node = order[i];

            int par = parent[node];

            int term2 = subtree[node];

            int term3 = n - term2;

            ans[node] = ans[par] - term2 + term3;
        }

        return ans;
    }
}
