#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        int n = nums.size();
        
        // 1. Sort the array - crucial for avoiding duplicates
        sort(nums.begin(), nums.end());

        for (int i = 0; i < n; i++) {
            // 2. Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 3. Use Two Pointers for the remaining sum
            int left = i + 1;
            int right = n - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    ans.push_back({nums[i], nums[left], nums[right]});
                    
                    // 4. Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Need a larger sum
                } else {
                    right--; // Need a smaller sum
                }
            }
        }
        return ans;
    }
};
