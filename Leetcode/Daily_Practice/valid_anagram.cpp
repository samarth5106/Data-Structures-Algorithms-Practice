class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length()) return false;
        unordered_map<char,int> unmps;
        for(char x:s){
            unmps[x]++;
        }
        for(char x:t){
    unmps[x]--;
    if(unmps[x]<0) return false;
}
        return true;
    }
};
