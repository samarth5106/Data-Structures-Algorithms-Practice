class Pair {
    int node;
    int distance;

    Pair(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }
}

class Solution {
    int bfs(int node, ArrayList<ArrayList<Pair>> adj, int n) {
        int mini = Integer.MAX_VALUE;
        int[] visi = new int[n + 1];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visi[node] = 1;
        
        while (!q.isEmpty()) {
            int nd = q.poll();
            
            for (int i = 0; i < adj.get(nd).size(); i++) {
                Pair edge = adj.get(nd).get(i);
                
                mini = Math.min(mini, edge.distance);
                if (visi[edge.node] == 0) {
                    visi[edge.node] = 1;
                    q.add(edge.node);
                }
            }
        }
        return mini;
    }

    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < roads.length; i++) {
            int node = roads[i][0];
            int v = roads[i][1];
            int dist = roads[i][2];
            adj.get(node).add(new Pair(v, dist));
            adj.get(v).add(new Pair(node, dist));
        }

        return bfs(1, adj, n);
    }
}
