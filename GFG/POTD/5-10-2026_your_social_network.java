class Solution {
    public ArrayList<ArrayList<Integer>> socialNetwork(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length + 1;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        int user = 1;
        for (int i = 0; i < arr.length; i++) {
            user++;
            int friend = arr[i];
            adj.get(user).add(friend);
        }
        
        for (int i = 2; i <= n; i++) {
            int[] dist = new int[n + 1];
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            
            while (!q.isEmpty()) {
                int curr = q.poll();
                for (int nxt : adj.get(curr)) {
                    dist[nxt] = dist[curr] + 1;
                    q.add(nxt);
                }
            }
            
            for (int j = 1; j < i; j++) {
                if (dist[j] > 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(i);
                    triplet.add(j);
                    triplet.add(dist[j]);
                    ans.add(triplet);
                }
            }
        }
        
        return ans;
    }
}
