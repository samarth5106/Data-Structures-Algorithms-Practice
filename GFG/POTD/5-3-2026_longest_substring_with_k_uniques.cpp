class Solution {
  public:
    int longestKSubstr(string &s, int k) {
        // code here
        unordered_map<char,int> unmp;
        int l=0,r=0;
        int ans=-1;
        int cnt=0;
        while(r<s.length()){
            unmp[s[r]]++;
            if(unmp[s[r]]==1){
                cnt++;
            }
            if(cnt>k){
                while(l<r&&cnt>k){
                    unmp[s[l]]--;
                    if(unmp[s[l]]==0){
                        cnt--;
                    }
                    l++;
                }
            }
            if(cnt==k){
                ans=max(ans,r-l+1);
            }
            r++;
        }
        return ans;
    }
};
