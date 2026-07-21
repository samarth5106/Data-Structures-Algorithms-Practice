import java.util.Arrays;

class Solution {
    public int maxIndexDifference(String s) {
        int n = s.length();
        
        // Track the LAST occurrence of each character in s
        int[] lastOccur = new int[26];
        Arrays.fill(lastOccur, -1);
        for (int i = 0; i < n; i++) {
            lastOccur[s.charAt(i) - 'a'] = i;
        }

        // minStart[char] stores the earliest 'a' index that can reach this character
        int[] minStart = new int[26];
        Arrays.fill(minStart, Integer.MAX_VALUE);

        int maxDiff = -1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int charIdx = ch - 'a';
            int currentMinStart = Integer.MAX_VALUE;

            if (ch == 'a') {
                currentMinStart = i; // An 'a' can start a sequence from its own index
            } else {
                // Any other character inherits the smallest starting 'a' index from the previous letter
                currentMinStart = minStart[charIdx - 1];
            }

            if (currentMinStart != Integer.MAX_VALUE) {
                // Keep the absolute earliest starting 'a' index that reached this letter
                minStart[charIdx] = Math.min(minStart[charIdx], currentMinStart);

                // A terminal/ending character is reached if NO NEXT LETTER exists to its right
                if (ch == 'z' || lastOccur[charIdx + 1] < i) {
                    maxDiff = Math.max(maxDiff, i - currentMinStart);
                }
            }
        }

        return maxDiff;
    }
}
