class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
        int l=0,h=nums.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid==0||mid==nums.size()-1)
            break;
            int idx;
            if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else{
                     if(nums[mid]!=nums[mid-1])
                    idx=mid;
                    
                    else
                    idx=mid-1;

                    if(idx%2!=0)
                    h=mid-1;
                    
                     else
                     l=mid+1;
            }
        }
        return nums[l];
    }
};
