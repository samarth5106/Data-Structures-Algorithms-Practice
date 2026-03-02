class Solution {
  public:
    int maxWater(vector<int> &arr) {
        int n=arr.size();
        if(n<=2) return 0;
        
        int l=0,r=n-1;
        int leftMaxht=0,rightMaxht=0;
        int ans=0;
        
        while(l<r){
            if(arr[l]<arr[r]){
                if(arr[l]>=leftMaxht){
                    leftMaxht=arr[l];
                }
                else{
                    ans+=leftMaxht-arr[l];
                }
                l++;
            }
            else{
                if(arr[r]>=rightMaxht){
                    rightMaxht=arr[r];
                }
                else{
                    ans+=rightMaxht-arr[r];
                }
                r--;
            }
        }
        
        return ans;
    }
};
