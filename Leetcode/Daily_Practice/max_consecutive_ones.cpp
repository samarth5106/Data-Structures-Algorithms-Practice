class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int l=0;
        int maxi=0;
        int r=0;

        while(r<nums.size()){
            if(nums[r]==0){
                maxi=max(maxi,r-l);
                l=r+1;
            }
            r++;
        }

        maxi=max(maxi,(int)nums.size()-l);
        return maxi;
    }
};
