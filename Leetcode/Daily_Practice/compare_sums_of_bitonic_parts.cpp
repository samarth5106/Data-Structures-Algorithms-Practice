class Solution {
public:
    int compareBitonicSums(vector<int>& nums) {
    long long sumincr=0;
        long long sumdecr=0;
        int peak;
        bool first=false;
        for(int i=0;i<nums.size();i++){
            if(i>0&&nums[i]<nums[i-1]){
                first=true;
            }
            if(first==false) sumincr+=nums[i];
            else{
                sumdecr+=nums[i];
            }
        }
        //sumdecr+=nums[first?0:0];
     peak=0;
        for(int i=1;i<nums.size();i++){
            if(nums[i]>nums[peak]) peak=i;
        }
        sumdecr+=nums[peak];
        
        if(sumincr==sumdecr) return -1;
        else if(sumincr>sumdecr) return 0;
        return 1;
    }
};©leetcode
