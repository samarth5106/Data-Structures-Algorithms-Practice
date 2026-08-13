class Solution {
    int pathcomp(int nd, int[] parent) {
        if (parent[nd] == nd) return nd;
        return parent[nd] = pathcomp(parent[nd], parent);
    }

    void unionBysize(int u, int v, int[] parent, int[] size) {
        int ulpu = pathcomp(u, parent);
        int ulpv = pathcomp(v, parent);

        if (ulpu == ulpv) return;

        if (size[ulpu] > size[ulpv]) {
            parent[ulpv] = ulpu;
            size[ulpu] += size[ulpv];
        } else {
            parent[ulpu] = ulpv;
            size[ulpv] += size[ulpu];
        }
    }

    public int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        int[] parent = new int[V];
        int[] size = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (ArrayList<Integer> edge : edges) {
            unionBysize(edge.get(0), edge.get(1), parent, size);
        }

        int components = 0;
        for (int i = 0; i < V; i++) {
            if (parent[i] == i) {
                components++;
            }
        }
        

        return components;
    }
}
