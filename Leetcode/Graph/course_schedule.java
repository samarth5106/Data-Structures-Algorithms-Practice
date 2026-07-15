class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        // Build graph
        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            adj[u].add(v);
        }

        // Compute indegree
        int[] indeg = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int v : adj[i]) {
                indeg[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0)
                q.offer(i);
        }

        int count = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            for (int v : adj[node]) {
                indeg[v]--;
                if (indeg[v] == 0) {
                    q.offer(v);
                }
            }
        }

        return count == numCourses;
    }
}
