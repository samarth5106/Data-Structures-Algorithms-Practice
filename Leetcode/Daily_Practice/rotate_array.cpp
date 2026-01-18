
class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        k=k%nums.size();
        int times=k;
        vector<int> temp;
        for(int i=nums.size()-k;i<nums.size();i++){
            temp.push_back(nums[i]);
        }
        for(int i=0;i<nums.size()-k;i++){
            temp.push_back(nums[i]);
        }
        for(int i=0;i<temp.size();i++){
            nums[i]=temp[i];
        }
    }
};
