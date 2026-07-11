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
    private boolean bfs(int startNode, int[] visited, ArrayList<ArrayList<Pair>> adj, char[][] board, Pair[] nodeToCoords, List<Integer> currentComponent) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startNode);
        visited[startNode] = 1;
        
        boolean isSurrounded = true;
        int rows = board.length;
        int cols = board[0].length;

        while (!q.isEmpty()) {
            int nd = q.remove();
            currentComponent.add(nd);

            Pair coords = nodeToCoords[nd];
            if (coords.r == 0 || coords.r == rows - 1 || coords.c == 0 || coords.c == cols - 1) {
                isSurrounded = false;
            }

            for (int i = 0; i < adj.get(nd).size(); i++) {
                Pair neighbor = adj.get(nd).get(i);
                if (visited[neighbor.val] == 0) {
                    visited[neighbor.val] = 1;
                    q.add(neighbor.val);
                }
            }
        }
        return isSurrounded;
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;
        int zros = 0;
        int[][] nodeMap = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    zros++;
                    nodeMap[i][j] = zros;
                }
            }
        }
        
        Pair[] nodeToCoords = new Pair[zros + 1];
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= zros; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    int currNode = nodeMap[i][j];
                    nodeToCoords[currNode] = new Pair(i, j);
                    
                    if (i != 0 && board[i - 1][j] == 'O') {
                        int neighborNode = nodeMap[i - 1][j];
                        adj.get(currNode).add(new Pair(neighborNode, new Pair(i - 1, j)));
                    }
                    if (i != rows - 1 && board[i + 1][j] == 'O') {
                        int neighborNode = nodeMap[i + 1][j];
                        adj.get(currNode).add(new Pair(neighborNode, new Pair(i + 1, j)));
                    }
                    if (j != 0 && board[i][j - 1] == 'O') {
                        int neighborNode = nodeMap[i][j - 1];
                        adj.get(currNode).add(new Pair(neighborNode, new Pair(i, j - 1)));
                    }
                    if (j != cols - 1 && board[i][j + 1] == 'O') {
                        int neighborNode = nodeMap[i][j + 1];
                        adj.get(currNode).add(new Pair(neighborNode, new Pair(i, j + 1)));
                    }
                }
            }
        }
        
        int[] visited = new int[zros + 1];
        for (int i = 1; i <= zros; i++) {
            if (visited[i] == 0) {
                List<Integer> currentComponent = new ArrayList<>();
                boolean verdict = bfs(i, visited, adj, board, nodeToCoords, currentComponent);
                
                if (verdict) {
                    for (int node : currentComponent) {
                        Pair coords = nodeToCoords[node];
                        board[coords.r][coords.c] = 'X';
                    }
                }
            }
        }
    }
}
