import java.util.*;

class Solution {
    static String findLongestWord(String s, List<String> d) {
        // Store all index positions for each character 'a'-'z' in s
        List<Integer>[] pos = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }
        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'].add(i);
        }

        String res = "";

        for (String word : d) {
            int wLen = word.length();
            int rLen = res.length();

            // Pruning: skip words that cannot beat the current result
            if (wLen < rLen || (wLen == rLen && word.compareTo(res) >= 0)) {
                continue;
            }

            if (isSubsequence(word, pos)) {
                res = word;
            }
        }

        return res;
    }

    private static boolean isSubsequence(String word, List<Integer>[] pos) {
        int lastPos = -1;

        for (int i = 0; i < word.length(); i++) {
            int c = word.charAt(i) - 'a';
            List<Integer> list = pos[c];
            if (list.isEmpty()) return false;

            // Binary search (upper bound) for the smallest index > lastPos
            int idx = upperBound(list, lastPos);
            if (idx == list.size()) {
                return false;
            }
            lastPos = list.get(idx);
        }

        return true;
    }

    private static int upperBound(List<Integer> list, int target) {
        int low = 0, high = list.size() - 1;
        int ans = list.size();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
