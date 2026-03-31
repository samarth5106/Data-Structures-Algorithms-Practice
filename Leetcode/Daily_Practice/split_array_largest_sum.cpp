class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        //largest sum is nothing just sum of that subarray
        // break into k subarrays unke respective sums me se jo max he vo store kro
        //then try other ways of breaking into k subarrays, and again unka respective sums me ka max
        //take the min among all the maxies,
        int l=*max_element(nums.begin(),nums.end());//10
        int h=0;//33
        for(int i=0;i<nums.size();i++){
            h+=nums[i];
        }
        int ans;
        while(l<=h){
            int mid=(l+h)/2;
            int stdnt=1;
            int sm=0;
           for(int i = 0; i < nums.size(); i++){
            if(sm + nums[i] <= mid)
                sm += nums[i];
                else {
                stdnt++;
                sm = nums[i];
                }
            }
            if(stdnt<=k){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return ans;

    }
};
