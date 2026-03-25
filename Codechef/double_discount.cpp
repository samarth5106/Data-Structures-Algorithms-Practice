#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin>>t;

    while(t--){
        int n,k;
        cin>>n>>k;

        vector<int>a(n),b(n);
        for(int i=0;i<n;i++) cin>>a[i];
        for(int i=0;i<n;i++) cin>>b[i];

        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                int mx=max(a[i],a[j]);
                int mn=min(a[i],a[j]);

                int disc=min(100,mx/2);
                int cost=mn+(mx-disc);

                if(cost<=k){
                    int taste=b[i]+b[j];
                    if(taste>ans) ans=taste;
                }
            }
        }

        cout<<ans<<"\n";
    }

    return 0;
}
