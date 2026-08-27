import java.util.Arrays;

class Solution {
    public int maxArea(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        // Step 1: Compute vertical consecutive 1s for each position
        int[][] hist = new int[n][m];
        
        for (int j = 0; j < m; j++) {
            hist[0][j] = mat[0][j];
            for (int i = 1; i < n; i++) {
                hist[i][j] = (mat[i][j] == 0) ? 0 : hist[i - 1][j] + 1;
            }
        }
        
        int maxArea = 0;
        
        // Step 2: For each row, sort heights in descending order to group columns
        for (int i = 0; i < n; i++) {
            int[] rowHist = hist[i].clone();
            Arrays.sort(rowHist); // sorts in ascending order
            
            // Iterate from largest to smallest height
            for (int k = m - 1; k >= 0; k--) {
                int height = rowHist[k];
                int width = m - k;
                maxArea = Math.max(maxArea, height * width);
            }
        }
        
        return maxArea;
    }
}
