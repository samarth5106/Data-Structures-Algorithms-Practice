class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        
        int l=0,h=nums.size()-1;
        int fst=-1,lst=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                fst=mid;
                h=mid-1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else l=mid+1;
        }
        l=0,h=nums.size()-1;
          while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                lst=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else l=mid+1;
        }
        vector<int> ans={fst,lst};
        return ans;

    }
};
