import java.util.*;

class Solution {
    // Segment Tree ka array jo max gaps store karega
    int[] tree;
    int MAX = 50005; // Queries me x ki max value safe side 50000 tak hoti hai

    // Segment tree me value update karne ke liye function - O(log N)
    void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = val;
            return;
        }
        int mid = (start + end) / 2;
        if (idx <= mid) update(2 * node, start, mid, idx, val);
        else update(2 * node + 1, mid + 1, end, idx, val);
        
        tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
    }

    // Range [l, r] me se maximum gap dhoondhne ke liye - O(log N)
    int queryMax(int node, int start, int end, int l, int r) {
        if (r < start || end < l) return 0;
        if (l <= start && end <= r) return tree[node];
        
        int mid = (start + end) / 2;
        int p1 = queryMax(2 * node, start, mid, l, r);
        int p2 = queryMax(2 * node + 1, mid + 1, end, l, r);
        return Math.max(p1, p2);
    }

    public List<Boolean> getResults(int[][] queries) {
        List<Boolean> al = new ArrayList<>();
        tree = new int[4 * MAX];
        
        // TreeSet sirf aage-piche ke neighbours jaldi dhoondhne ke liye
        TreeSet<Integer> obs = new TreeSet<>();
        obs.add(0);
        obs.add(MAX); // Ek virtual end deewar
        
        // Shuruat me 0 se MAX tak ka single bada gap hai
        update(1, 0, MAX, MAX, MAX);

        for (int i = 0; i < queries.length; i++) {
            int qry = queries[i][0];
            
            if (qry == 1) {
                int x = queries[i][1];
                if (obs.contains(x)) continue; // Agar deewar pehle se hai toh skip
                
                int prev = obs.floor(x);
                int next = obs.ceiling(x);
                
                obs.add(x);
                
                // Segment Tree me naye toote hue gaps update karo
                update(1, 0, MAX, x, x - prev);
                update(1, 0, MAX, next, next - x);
            } 
            else {
                int x = queries[i][1];
                int siz = queries[i][2];
                
                // 1. 0 se lekar x ke just pehle tak ka max gap tree se poocho
                int maxGapInLeft = queryMax(1, 0, MAX, 0, x);
                
                // 2. Aakhri obstacle aur x ke beech ka bacha hua gap nikal lo
                int lastObstacle = obs.floor(x);
                int lastGap = x - lastObstacle;
                
                // Dono me se jo bhi max gap ho
                int totalMaxGap = Math.max(maxGapInLeft, lastGap);
                
                if (totalMaxGap >= siz) {
                    al.add(true);
                } else {
                    al.add(false);
                }
            }
        }
        return al;
    }
}
