class Solution {
  public:
    long subarrayXor(vector<int> &arr, int k) {
        unordered_map<int,int> mp;
        int xora=0;
        long cnt=0;
        mp[0]=1;
        
        for(int i=0;i<arr.size();i++){
            xora^=arr[i];
            int target=xora^k;
            if(mp.find(target)!=mp.end()){
                cnt+=mp[target];
            }
            mp[xora]++;
        }
        return cnt;
    }
};
