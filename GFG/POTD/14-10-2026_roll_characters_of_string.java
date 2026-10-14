class Solution {
    public static String findRollOut(String s, int[] roll) {
        int n = s.length();
        int[] rollCount = new int[n + 1];

        // Step 1: Count roll frequencies for each length
        for (int k : roll) {
            rollCount[k]++;
        }

        // Step 2: Calculate cumulative rolls via suffix sum
        int currentRolls = 0;
        char[] result = s.toCharArray();

        for (int i = n - 1; i >= 0; i--) {
            // rollCount[i + 1] contains rolls affecting characters up to index i
            currentRolls = (currentRolls + rollCount[i + 1]) % 26;

            int shifted = (result[i] - 'a' + currentRolls) % 26;
            result[i] = (char) ('a' + shifted);
        }

        return new String(result);
    }
}
