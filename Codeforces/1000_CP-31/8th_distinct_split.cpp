#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
        cin>>t;
        while(t--){
            int n;
            cin>>n;
            string s;
            cin>>s;
        
        vector<int> pref(n),suff(n);
        vector<int> freq(26,0);
        
        int distinct=0;
        for(int i=0;i<n;i++){
            if(freq[s[i]-'a']==0){
                distinct++;
            }
            freq[s[i]-'a']++;
            pref[i]=distinct;
        }
        
        fill(freq.begin(),freq.end(),0);
        distinct=0;
        
        for(int i=n-1;i>=0;i--){
            if(freq[s[i]-'a']==0){
                distinct++;
            }
            freq[s[i]-'a']++;
            suff[i]=distinct;
        }
        
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=max(ans,pref[i]+suff[i+1]);
        }
        cout<<ans<<endl;
            
            
        }
}
