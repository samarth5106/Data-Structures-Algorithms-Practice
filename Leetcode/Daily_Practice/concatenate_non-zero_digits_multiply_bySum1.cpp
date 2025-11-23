class Solution {
public:
    long long sumAndMultiply(int n) {
        string s=to_string(n);
       
        string ans="";
        int sum=0;
        for(long long i=0;i<s.size();i++){
            if(s[i]!='0'){
                   ans+=s[i];
                sum=sum+(s[i]-'0');               
             
            }
            
        }
          if (ans.empty()) {
            return 0;
        }
        long long a;
        a=stoll(ans);
        a*=sum;
        return a;
    }
};
