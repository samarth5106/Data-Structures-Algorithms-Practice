import java.util.*;

class pair {
    int node;
    long wt;
    pair(long cost, int nd) {
        wt = cost;
        node = nd;
    }
}

class Solution {

    int solve(int node, int dest, long[] dist, ArrayList<ArrayList<pair>> adj, int[] dp) {
        
        if (node == dest) return 1;

        if (dp[node] != -1) return dp[node];

        int cnt = 0;
        for (int i = 0; i < adj.get(node).size(); i++) {
            pair neighbor = adj.get(node).get(i);
            int nextNode = neighbor.node;
            long edgeWt = neighbor.wt;

            // ONLY traverse edges that belong to the shortest path
            if (dist[nextNode] == dist[node] + edgeWt) {
                cnt = (cnt + solve(nextNode, dest, dist, adj, dp)) % ((int) 1e9 + 7);
            }
        }

        return dp[node] = cnt;
    }

    public int countPaths(int n, int[][] roads) {
 
        long dist[] = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < roads.length; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            long wt = roads[i][2];
            adj.get(u).add(new pair(wt, v));
            adj.get(v).add(new pair(wt, u));
        }

        PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> Long.compare(x.wt, y.wt));
        pq.add(new pair(0, 0));

        while (!pq.isEmpty()) {
            pair pr = pq.remove();
            long wt = pr.wt;
            int node = pr.node;

            if (wt > dist[node]) continue;

            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).node;
                long cost = adj.get(node).get(i).wt;
                if (dist[v] > wt + cost) {
                    dist[v] = wt + cost;
                    pq.add(new pair(dist[v], v));
                }
            }
        }

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return solve(0, n - 1, dist, adj, dp);
    }
}
