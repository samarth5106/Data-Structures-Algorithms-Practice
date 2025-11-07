class Solution {
public:
    int countGoodSubstrings(string s) {
        if(s.length()<=2){
            return 0;
        }
        int cnt=0;
        int l=0,r=2;
       if(s[l]!=s[l+1]&&s[l+1]!=s[l+2]&&s[l+2]!=s[l]){
        cnt++;
       }
       while(r<s.length()-1){
        r++;
        l++;
        if(s[r]!=s[l]&&s[l+1]!=s[r]&&s[l]!=s[l+1]){
            cnt++;
        }
       }
return cnt;
    }
};
