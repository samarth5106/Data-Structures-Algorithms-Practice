class Solution {
    public int numOfWays(int n, int m) {
        long total_cells = (long) n * m;
        // Order matters, so no division by 2
        long total_ways = total_cells * (total_cells - 1); 
        
        long attacking_ways = 0;
        // Each box now contributes 4 invalid ways (2 directions * 2 color swaps)
        if (n >= 1 && m >= 2) {
            attacking_ways += 4L * (n - 1) * (m - 2);
        }
        if (n >= 2 && m >= 1) {
            attacking_ways += 4L * (n - 2) * (m - 1);
        }
        
        return (int) (total_ways - attacking_ways);
    }
}
