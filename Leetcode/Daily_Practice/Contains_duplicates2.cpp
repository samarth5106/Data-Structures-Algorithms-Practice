class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int, int> unmp;

        for (int i = 0; i < nums.size(); i++) {
            if (unmp.find(nums[i]) != unmp.end() && i - unmp[nums[i]] <= k) {
                return true;
            }
            unmp[nums[i]] = i;
        }

        return false;
    }
};
