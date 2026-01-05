class Solution {
  public:
    int maxSubarraySum(vector<int>& arr, int k) {
        // code here
        int l=0;
        int r=k-1;
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        int maxi=-1;
        maxi=max(sum,maxi);
        r++;
        while(r<arr.size()){
            
            sum+=arr[r];
          sum-=arr[l];
         l++;
            maxi=max(maxi,sum);
           r++;
            
        }
        return maxi;
        
        
    }
};
