import java.util.Arrays;

class Solution {
    int togsum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
    
    int solve(String s, int idx, int prevsum, int[][] dp) {
        if (idx == s.length()) return 1;
        if (dp[idx][prevsum] != -1) return dp[idx][prevsum];
        
        int totalWays = 0;
        int currentSum = 0;
        
        for (int i = idx; i < s.length(); i++) {
            // substring() call karne ki jagah character ko direct add karna fast hota hai
            currentSum += s.charAt(i) - '0';
            
            if (currentSum >= prevsum) {
                totalWays += solve(s, i + 1, currentSum, dp);
            }
        }
        
        dp[idx][prevsum] = totalWays;
        return totalWays;
    }
    
    public int validGroups(String s) {
        int maxPossibleSum = togsum(s);
        // 2D DP matrix banaya dono changing parameters ke liye
        int[][] dp = new int[s.length() + 1][maxPossibleSum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(s, 0, 0, dp); 
    }
}
