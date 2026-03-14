class Solution {
public:
    long long countFancy(long long l, long long r) {
        //good - all integers are strctly incr or decr
        //fancy - together sum is good 
        long long cnt=0;
        for(long long i=l;i<=r;i++){
            string s =to_string(i);
            bool isit=true;
            bool incr=false;
            bool decr=false;
            int sum=0;
            if(s.length()==1){
                cnt++;continue;
            }


             if(s[0]-'0'<s[1]-'0'){
                   incr=true; 
                }
                else if(s[0]-'0'>s[1]-'0'){
                   decr=true; 
                }
                else
                isit=false;
            for(long long j=1;j<s.length()-1;j++){
                if(incr){
                    if(s[j]-'0'>s[j+1]-'0'||s[j]-'0'==s[j+1]-'0'){
                        isit=false;break;
                     }
                }
                if(decr){
                    if(s[j]-'0'<s[j+1]-'0'||s[j]-'0'==s[j+1]-'0'){
                        isit=false;break;
                     }
                }

            }



            if(!isit){
                isit=true;
                incr=false;
                decr=false;
                for(long long j=0;j<s.length();j++){
               char ch=s[j];
                sum+=ch-'0';
            }
            s=to_string(sum);
            if(s.length()==1){
                cnt++;continue;
            }
            if(s[0]-'0'<s[1]-'0'){
                   incr=true; 
                }
                else if(s[0]-'0'>s[1]-'0'){
                   decr=true; 
                }
                else
                isit=false;
            for(long long j=1;j<s.length()-1;j++){
                if(incr){
                    if(s[j]-'0'>s[j+1]-'0'){
                        isit=false;break;
                     }
                }
                if(decr){
                    if(s[j]-'0'<s[j+1]-'0'){
                        isit=false;break;
                     }
                }
            }


            }
            if(isit)
            cnt++;
            
            
        }
        return cnt;
    }
};


NOTE: this code gives TLE need to optimise,, use DP

