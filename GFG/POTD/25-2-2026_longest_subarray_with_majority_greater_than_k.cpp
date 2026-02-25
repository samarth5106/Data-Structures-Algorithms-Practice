class Solution {
public:
    int longestSubarray(vector<int> &arr, int k) {
        int n=arr.size();
        unordered_map<int,int> mp;
        int sum=0;
        int maxl=0;
        for(int i=0;i<n;i++){
            sum+=(arr[i]>k)?1:-1;
            if(sum>0){
                maxl=i+1;
            }else{
                if(mp.find(sum-1)!=mp.end()){
                    maxl=max(maxl,i-mp[sum-1]);
                }
            }
            if(mp.find(sum)==mp.end()){
                mp[sum]=i;
            }
        }
        return maxl;
    }
};
