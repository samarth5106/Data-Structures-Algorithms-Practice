class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int l=1;
        int val=0;
        for(int i=0;i<nums.size();i++){
            val=max(val,nums[i]);
        }
        int ans;
        int h=val;
        while(l<=h){
            int mid=(l+h)/2;
            int sum=0;
            for(int i=0;i<nums.size();i++){
                sum+=(nums[i]+mid-1)/mid;
            }
            if(sum<=threshold){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
        
    }
};
