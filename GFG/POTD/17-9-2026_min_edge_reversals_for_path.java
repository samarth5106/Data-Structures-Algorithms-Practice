import java.util.*;

class Solution {
    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    public int minimumEdgeReversal(int[][] edges, int n, int src, int dst) {
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(new Edge(v, 0));
            adj.get(v).add(new Edge(u, 1));
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        Deque<Integer> deque = new ArrayDeque<>();
        dist[src] = 0;
        deque.addFirst(src);

        while (!deque.isEmpty()) {
            int curr = deque.pollFirst();

            if (curr == dst) {
                return dist[curr];
            }

            for (Edge edge : adj.get(curr)) {
                if (dist[curr] + edge.weight < dist[edge.to]) {
                    dist[edge.to] = dist[curr] + edge.weight;
                    if (edge.weight == 0) {
                        deque.addFirst(edge.to);
                    } else {
                        deque.addLast(edge.to);
                    }
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
