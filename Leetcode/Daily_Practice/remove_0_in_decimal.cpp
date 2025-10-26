class Solution {
public:
    long long removeZeros(long long n) {
        string s="";
        string given=to_string(n);
        for(int i=0;i<given.size();i++){
            if(given[i]!='0'){
                s+=given[i];
            }
            
        }
        long long ans=stoll(s);
        return ans;
    }
};
