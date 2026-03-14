class Solution {
public:
    long long gcd(long long a, long long b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}
  
    long long gcdSum(vector<int>& nums) {
        int l=0,r=0;
          vector<long long> prefix(nums.size());
        int maxi=nums[l];
        while(r<nums.size()){
            if(maxi<nums[r]){
                maxi=nums[r];
            }
            prefix[r]=gcd(maxi,nums[r]);
            r++;
            
        }
        int n=prefix.size();
        sort(prefix.begin(),prefix.end());
        r=n-1;l=0;
        long long sum=0;
        while(l<r){
            sum+=gcd(prefix[l],prefix[r]);
            l++;
            r--;
        }
        return sum;
        
    }
};©leetcode
