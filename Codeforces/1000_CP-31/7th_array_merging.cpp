#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;

        vector<int>a(n),b(n);
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<n;i++) cin>>b[i];

        unordered_map<int,int>ma,mb;

        // process a
        int cnt=1;
        for(int i=1;i<=n;i++){
            if(i<n && a[i]==a[i-1]){
                cnt++;
            }else{
                ma[a[i-1]]=max(ma[a[i-1]],cnt);
                cnt=1;
            }
        }

        // process b
        cnt=1;
        for(int i=1;i<=n;i++){
            if(i<n && b[i]==b[i-1]){
                cnt++;
            }else{
                mb[b[i-1]]=max(mb[b[i-1]],cnt);
                cnt=1;
            }
        }

        int ans=0;

        for(auto &p:ma){
            int val=p.first;
            ans=max(ans,p.second+mb[val]);
        }

        for(auto &p:mb){
            ans=max(ans,p.second);
        }

        cout<<ans<<endl;
    }
}
