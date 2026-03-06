class Solution {
  public:
    string minWindow(string &s, string &p) {
        vector<int>freq(256,0);
        
        for(char c:p) freq[c]++;
        
        int l=0,r=0;
        int required=p.size();
        int start=0;
        int minlen=INT_MAX;
        
        while(r<s.size()){
            
            if(freq[s[r]]>0) required--;
            
            freq[s[r]]--;
            r++;
            
            while(required==0){
                
                if(r-l<minlen){
                    minlen=r-l;
                    start=l;
                }
                
                freq[s[l]]++;
                
                if(freq[s[l]]>0) required++;
                
                l++;
            }
        }
        
        if(minlen==INT_MAX) return "";
        
        return s.substr(start,minlen);
    }
};
