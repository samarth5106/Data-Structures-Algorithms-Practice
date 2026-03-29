class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int idxx=0;
        int l=0,h=nums.size()-1;
        if(nums.size()==1) return 0;
        if(nums.size()==2){
            if(nums[0]>nums[1])return 0;
            return 1;
        }
        while(l<=h){
            int mid=(l+h)/2;
            if(mid!=0&&mid!=nums.size()-1){
                if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    l=mid+1;
                }
                else h=mid;
            }
            else return mid; 
        }
        return -1;
    }
};
