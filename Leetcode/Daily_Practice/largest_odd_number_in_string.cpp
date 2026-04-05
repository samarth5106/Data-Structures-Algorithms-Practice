class Solution {
public:
    string largestOddNumber(string num) {
        string ans="";
        int ch=num[num.length()-1]-'0';
        if(ch%2==1){
            return num;
        }
        for(int i=num.length()-1;i>=0;i--){
            int ch=num[i]-'0';
            if(ch%2==1){
                ans=num.substr(0,i+1);
                return ans;
            }
        }
        return ans;
    }
};
