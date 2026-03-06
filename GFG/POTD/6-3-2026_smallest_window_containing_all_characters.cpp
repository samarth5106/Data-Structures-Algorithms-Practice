class Solution {
  public:
    string minWindow(string &s, string &p) {
        // code here
         int required=p.length();
         int current=0;
         unordered_map<int,int> unmpp;
         for(int i=0;i<p.length();i++){
             unmpp[p[i]]++;
         }
         unordered_map<int,int> unmps;
         int l=0,r=0;
         string ans="";
         int mini=INT_MAX;
         int a,b;
         bool mila=false;
         while(r<s.length()){
            unmps[s[r]]++;
             if(unmpp.find(s[r])!=unmpp.end()){
                 if(unmps[s[r]]<=unmpp[s[r]]){
                     current++;
                    }
                }
                else{
                    r++;
                    continue;
                }
                if(current>=required){
                    mila=true;
                    while(l<r&&current>=required){
                        if(unmpp.find(s[l])!=unmpp.end()){
                            if(unmps[s[l]]==unmpp[s[l]]){
                                current--;
                            }
                             unmps[s[l]]--;
                        }
                        l++;
                        if(current<required){
                            l--;
                            current++;
                            unmps[s[l]]++;
                            break;
                        }
                    }
                    if(r-l+1<mini){
                        mini=r-l+1;
                        a=l,b=r;
                    }
                }
             r++;
         }
         if(mila){
         for(int i=a;i<=b;i++){
             ans+=s[i];
         }
         }
         return ans;
    }
};


My Approach : See pahle hamne map me string p ke characters ki frequency store kr li then 
		String s ko sliding window se traverse kiya aur hashmap me characters ki frequency maintain ki. Jaise-jaise window expand hoti gayi,
 check kiya ki p ke required characters (duplicates ke saath) satisfy ho rahe hain ya nahi. Jab saare required characters window me mil gaye,
 tab left se window ko shrink karna start kiya taaki smallest valid substring mil sake
. Is process me har valid window par minimum length track ki aur end me wahi smallest window return ki.
