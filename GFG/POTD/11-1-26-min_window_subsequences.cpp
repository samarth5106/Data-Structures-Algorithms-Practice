class Solution {
public:
    string minWindowSubsequence(string s1, string s2) {
        int n = s1.size(), m = s2.size();
        int bestLen = INT_MAX, bestStart = -1;

        for (int i = 0; i < n; i++) {
            if (s1[i] != s2[0]) continue;

            int p1 = i, p2 = 0;

            // forward match s2 as subsequence
            while (p1 < n && p2 < m) {
                if (s1[p1] == s2[p2]) p2++;
                p1++;
            }

            if (p2 < m) break; // no more possible

            // backward shrink
            int end = p1 - 1;
            p2 = m - 1;
            p1 = end;

            while (p2 >= 0) {
                if (s1[p1] == s2[p2]) p2--;
                p1--;
            }

            int start = p1 + 1;
            int len = end - start + 1;

            if (len < bestLen) {
                bestLen = len;
                bestStart = start;
            }
        }

        return (bestStart == -1) ? "" : s1.substr(bestStart, bestLen);
    }
};
