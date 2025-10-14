class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double avg;
        double maxi,sum=0.0;
        int l=0,r=0,i=0;
        while(r<k){
            sum+=nums[r];
        r++;
        }
        avg=sum/(k);
        maxi=avg;
        while(r<nums.size()){
            sum-=nums[l];
            sum+=nums[r];
            l++;
            r++;
            
            avg=sum/k;
            maxi=max(maxi,avg);
        }
        return maxi;
    }
};
