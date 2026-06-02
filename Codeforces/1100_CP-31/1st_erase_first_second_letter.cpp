#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;

        string s;
        cin>>s;

        vector<int> freq(26,0);
        long long cnt=0,ans=0;

        for(int i=0;i<n;i++){
            if(freq[s[i]-'a']==0) cnt++;
            freq[s[i]-'a']++;
            ans+=cnt;
        }

        cout<<ans<<"\n";
    }

    return 0;
}
