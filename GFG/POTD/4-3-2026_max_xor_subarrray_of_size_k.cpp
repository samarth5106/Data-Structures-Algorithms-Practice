class Solution {
  public:
    int maxSubarrayXOR(vector<int>& arr, int k) {
        // code here
        int xr=0;
        int maxxr=-1;
        int l=0,r=k-1;
        for(int i=0;i<=r;i++){
            xr=xr^arr[i];
        }
        maxxr=max(xr,maxxr);
        r++;
        while(r<arr.size()){
            xr=xr^arr[r];
            xr=xr^arr[l];
            l++;
            r++;
            maxxr=max(xr,maxxr);
        }
        return maxxr;
    }
};
