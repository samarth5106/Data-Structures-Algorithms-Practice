import java.util.*;

class Solution {
    public int maxTwoEvents(int[][] events) {

        // Step 1: sort by start time
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int n = events.length;

        // Step 2: build suffix max array
        int[] suffixMax = new int[n];
        suffixMax[n - 1] = events[n - 1][2];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(events[i][2], suffixMax[i + 1]);
        }

        int ans = 0;

        // Step 3: try each event as first event
        for (int i = 0; i < n; i++) {

            // option 1: take only this event
            ans = Math.max(ans, events[i][2]);

            int endTime = events[i][1];

            // binary search for next valid event
            int lo = i + 1, hi = n - 1;
            int nextIdx = -1;

            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (events[mid][0] >= endTime + 1) {
                    nextIdx = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }

            // option 2: take two events
            if (nextIdx != -1) {
                ans = Math.max(ans, events[i][2] + suffixMax[nextIdx]);
            }
        }

        return ans;
    }
}
