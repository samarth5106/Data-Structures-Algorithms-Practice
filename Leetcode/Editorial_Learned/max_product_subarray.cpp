class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int prevmin = nums[0];
        int prevmax = nums[0];
        int ans = nums[0];   // also fix this

        for(int i = 1; i < nums.size(); i++) {
            int tempMin = prevmin;
            int tempMax = prevmax;

            prevmin = min(nums[i], min(nums[i]*tempMin, nums[i]*tempMax));
            prevmax = max(nums[i], max(nums[i]*tempMin, nums[i]*tempMax));

            ans = max(ans, prevmax);
        }
        return ans;
    }
};
