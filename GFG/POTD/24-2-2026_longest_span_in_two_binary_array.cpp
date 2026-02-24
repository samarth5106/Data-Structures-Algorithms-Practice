class Solution {
  public:
    int equalSumSpan(vector<int> &a1, vector<int> &a2) {
        // code here
        
     int sz=a1.size();
    unordered_map<int,int> unmp;
    int prefix=0;
    int maxl=0;
    unmp[0]=-1; 
    
    for(int i=0;i<sz;i++){
        
        prefix+=(a1[i]-a2[i]);
        if(unmp.find(prefix)!=unmp.end()){
            maxl=max(maxl,i-unmp[prefix]);
        }
        else unmp[prefix]=i;  
    }
    
    return maxl;
    }
};
