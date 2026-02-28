class Solution {
public:
    vector<int> minDistinctFreqPair(vector<int>& nums) {
        //sort(nums.begin(),nums.end());
        vector<int> ans(2,-1);
        if(nums.size()==1){
            return ans;
        }
        map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }

        int x=INT_MAX-3,y=INT_MAX-2;
        int allffreq=mp[nums[0]];
        bool all=true;
        int freq;
        for(const auto &p:mp){
            if(allffreq!=p.second){
                all=false;
            }
            if(p.first<x&&p.first<y){
                x=p.first;
                freq=p.second;
                continue;
            }
            if(p.second!=freq){
                y=p.first;
                break;
            }
            
        }
        if(all){
            return ans;
        }
        ans.clear();
        ans.push_back(x);
        ans.push_back(y);
        return ans;
    }
};©leetcode
