class Solution {
public:
    string reverseWords(string s) {
        string ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(s[i]==' '){
                while(i>=0&&s[i]==' '){
                    i--;
                }
            }
            if(i<0) break;
            int ini=i;
            while(i>=0&&s[i]!=' '){
                i--;
            }
            for(int j=i+1;j<=ini;j++){
                ans+=s[j];
            }
            ans+=' ';
        }
        if(ans.length()>0) ans.pop_back();
        return ans;
    }
};
