class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<int> ans;
        
        int expected = nums[0];
        
        for(int i = 0; i < nums.size(); i++){
            while(expected < nums[i]){
                ans.push_back(expected);
                expected++;
            }
            expected = nums[i] + 1
        }
        
        return ans;
    }
};

