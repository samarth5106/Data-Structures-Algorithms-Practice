class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> unmps;
        unordered_map<char,char>unmpt;

        for(int i=0;i<t.length();i++){
            if(unmpt.find(t[i])==unmpt.end()&&unmps.find(s[i])==unmps.end()){
                unmpt[t[i]]=s[i];//t[i] ke lie s[i] bna hai
                unmps[s[i]]=t[i];// s[i] ke lie t[i] bana hai
            }
            
            else{
                if(unmpt.find(t[i])!=unmpt.end()){
                    if(unmpt[t[i]]!=s[i]) return false;
                }
                else if(unmps.find(s[i])!=unmps.end()){
                    if(unmps[s[i]]!=t[i]) return false;
                }

            }
           
        }
        return true;

    }
};
