import java.util.*;

class Pair {
    int r;
    int c;
    int val;
    Pair cell;
    public Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
    public Pair(int val, Pair cell) {
        this.val = val;
        this.cell = cell;
    }
}

class Solution {
    int bfs(int node, int[] visi, ArrayList<ArrayList<Pair>> adj, int[][] grid, Pair[] nodeToCoords) {
        visi[node] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        int cnt = 0;
        boolean isBoundaryComponent = false;
        
        while (!q.isEmpty()) {
            int nd = q.remove();
            cnt++;
            
            Pair coords = nodeToCoords[nd];
            if (coords.r == 0 || coords.r == grid.length - 1 || coords.c == 0 || coords.c == grid[0].length - 1) {
                isBoundaryComponent = true;
            }
            
            for (int i = 0; i < adj.get(nd).size(); i++) {
                Pair neighbor = adj.get(nd).get(i);
                if (visi[neighbor.val] == 0) {
                    q.add(neighbor.val);
                    visi[neighbor.val] = 1;
                }
            }
        }
        
        if (isBoundaryComponent) return cnt;
        return 0;
    }

    public int numEnclaves(int[][] grid) {
        int ons = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    ons++;
                    grid[i][j] = ons;
                }
            }
        }
        
        Pair[] nodeToCoords = new Pair[ons + 1];
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= ons; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    int currNode = grid[i][j];
                    nodeToCoords[currNode] = new Pair(i, j);
                    
                    if (i != 0 && grid[i - 1][j] != 0) {
                        Pair coordinates = new Pair(i - 1, j);
                        adj.get(currNode).add(new Pair(grid[i - 1][j], coordinates));
                    }
                    if (i != rows - 1 && grid[i + 1][j] != 0) {
                        Pair coordinates = new Pair(i + 1, j);
                        adj.get(currNode).add(new Pair(grid[i + 1][j], coordinates));
                    }
                    if (j != 0 && grid[i][j - 1] != 0) {
                        Pair coordinates = new Pair(i, j - 1);
                        adj.get(currNode).add(new Pair(grid[i][j - 1], coordinates));
                    }
                    if (j != cols - 1 && grid[i][j + 1] != 0) {
                        Pair coordinates = new Pair(i, j + 1);
                        adj.get(currNode).add(new Pair(grid[i][j + 1], coordinates));
                    }
                }
            }
        }
        
        int boundaryConnected = 0;
        int[] visited = new int[ons + 1];
        for (int i = 1; i <= ons; i++) {
            if (visited[i] == 0) {
                boundaryConnected += bfs(i, visited, adj, grid, nodeToCoords);
            }
        }
        
        return ons - boundaryConnected;
    }
}
