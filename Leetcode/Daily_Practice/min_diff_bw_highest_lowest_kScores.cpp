class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int j=nums.size()-1;
        int l=0,r=k-1;
        int mindiff=INT_MAX,maxi=-1,mini=INT_MAX;
        while(r<nums.size()){
            int num1=nums[l];
            int num2=nums[r];
            mindiff=min(mindiff,num2-num1);
            l++;
            r++;
        }
        return mindiff;

    }
};
