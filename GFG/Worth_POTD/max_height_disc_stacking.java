import java.util.*;

class Solution {
    // 1D Fenwick Tree (Binary Indexed Tree) to maintain max stack height by height dimension
    static class FenwickTree {
        int size;
        int[] tree;

        FenwickTree(int size) {
            this.size = size;
            this.tree = new int[size + 1];
        }

        void update(int index, int val) {
            for (int i = index; i <= size; i += i & -i) {
                tree[i] = Math.max(tree[i], val);
            }
        }

        int query(int index) {
            int maxVal = 0;
            for (int i = index; i > 0; i -= i & -i) {
                maxVal = Math.max(maxVal, tree[i]);
            }
            return maxVal;
        }
    }

    public int maxStackHeight(int[] r, int[] h) {
        int n = r.length;
        
        // Group discs by radius: r -> list of unique heights
        // Note: For identical (r, h), we can only pick one disc in a strictly increasing chain.
        // Even if we picked the same dimensions, the condition specifies STRICTLY smaller dimensions.
        int maxR = 0;
        int maxH = 0;
        for (int i = 0; i < n; i++) {
            maxR = Math.max(maxR, r[i]);
            maxH = Math.max(maxH, h[i]);
        }

        // Store unique heights present for each radius
        // Using a boolean array / set to eliminate duplicate (r, h) pairs
        boolean[][] exists = new boolean[maxR + 1][maxH + 1];
        for (int i = 0; i < n; i++) {
            exists[r[i]][h[i]] = true;
        }

        FenwickTree bit = new FenwickTree(maxH);
        int overallMax = 0;

        // Process radii in strictly increasing order
        for (int currR = 1; currR <= maxR; currR++) {
            // Collect all updates for this radius first to ensure strict radius ordering
            List<int[]> updates = new ArrayList<>();
            
            for (int currH = 1; currH <= maxH; currH++) {
                if (exists[currR][currH]) {
                    // We need a disc below with height < currH and radius < currR
                    int bestBelow = bit.query(currH - 1);
                    int currentHeight = bestBelow + currH;
                    updates.add(new int[]{currH, currentHeight});
                    overallMax = Math.max(overallMax, currentHeight);
                }
            }

            // Apply updates after querying all discs with radius currR
            for (int[] update : updates) {
                bit.update(update[0], update[1]);
            }
        }

        return overallMax;
    }
}
