#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n,k,a,b;
        cin>>n>>k>>a>>b;
        vector<long long> x(n),y(n);
        for(int i=0;i<n;i++){
            cin>>x[i]>>y[i];
        }
        long long currx=x[a-1];
        long long curry=y[a-1];
        long long currdist=abs(currx-x[b-1])+abs(curry-y[b-1]);
        if(k==0){
            cout<<currdist<<"\n";
            continue;
        }
        long long mini=1e18;
        for(int i=0;i<k;i++){//closest major city from a
            long long dist=abs(currx-x[i])+abs(curry-y[i]);
            if(dist<mini){
                mini=dist;
            }
        }
        long long closemajor=1e18;
        for(int i=0;i<k;i++){// closest major city from b
            long long dist=abs(x[b-1]-x[i])+abs(y[b-1]-y[i]);
            if(dist<closemajor){
                closemajor=dist;
            }
        }
        if(a-1<k)mini=0;
        if(b-1<k)closemajor=0;
        long long ans=min(currdist,mini+closemajor);
        cout<<ans<<"\n";
    }
    return 0;
}
