class Solution {
public:
    int myAtoi(string s) {
        string ans="0";
        
        int i=0;
        while(i<s.length()&&s[i]==' '){
            i++;
        }
        
        bool neg=false;
       
        if(i<s.length()&&(s[i]=='-'||s[i]=='+')){
    if(s[i]=='-'){
        neg=true;
    }
    i++;
}
       
        
        while(i<s.length()&&s[i]=='0'){
            i++;
        }

        while(i<s.length()){
            if(s[i]>='0'&&s[i]<='9'){
                ans+=s[i];
            }
            else break;
            i++;
        }

        long long toret=0;
        for(int j=0;j<ans.length();j++){
            int digit=ans[j]-'0';

            if(toret>(INT_MAX-digit)/10){
                return neg?INT_MIN:INT_MAX;
                if(neg){
                    return INT_MIN;

                }
                return INT_MAX;
            }

            toret=toret*10+digit;
        }

        if(neg==true){
            toret=-1*toret;
        }

        return (int)toret;
    }
};
