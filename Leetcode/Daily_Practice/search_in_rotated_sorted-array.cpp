class Solution {
public:
    int search(vector<int>& nums, int target) {
        int idx=nums.size();
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]>nums[i+1]){
                idx=i+1;break;
            }
        }
        
        int l=0,h=idx-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
        if(idx!=nums.size()){
            l=idx;
        h=nums.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        }
        return -1;
        

    }
};
