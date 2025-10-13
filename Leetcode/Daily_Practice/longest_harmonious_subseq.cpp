class Solution {
public:
    int findLHS(vector<int>& nums) {
        int maxsize=0;
        unordered_map<int,int> freq;
        
        for(int i=0;i<nums.size();i++){
            freq[nums[i]]++;
        }
        
        for(auto& p:freq){
            int num=p.first;
            int count=p.second;
            if(freq.find(num+1)!=freq.end()){
                int size=count+freq[num+1];
                maxsize=max(maxsize,size);
            }
        }
        
        return maxsize;
    }
};
