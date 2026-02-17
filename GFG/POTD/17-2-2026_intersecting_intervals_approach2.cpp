#include <vector>
#include <algorithm>
#include <queue>

using namespace std;

class Solution {
public:
    int overlapInt(vector<vector<int>> &arr) {
        if (arr.empty()) return 0;

        sort(arr.begin(), arr.end());

        priority_queue<int, vector<int>, greater<int>> minHeap;
        int maxOverlap = 0;

        for (int i = 0; i < arr.size(); i++) {
            while (!minHeap.empty() && minHeap.top() < arr[i][0]) {
                minHeap.pop();
            }

            minHeap.push(arr[i][1]);
            
            int currentSize = minHeap.size();
            maxOverlap = max(maxOverlap, currentSize);
        }

        return maxOverlap;
    }
};
