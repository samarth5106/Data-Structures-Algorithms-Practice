#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        long long a,b,p,q,r;
        cin>>a>>b>>p>>q>>r;
        long long ans=-1;
        long long m=min(a,b);
        for(long long k=0;k<=m;k++){
            long long rem_a=a-k;
            long long rem_b=b-k;
            long long cost_a=((rem_a+1)/2)*p;
            long long cost_b=((rem_b+1)/2)*q;
            long long total=k*r+cost_a+cost_b;
            if(ans==-1||total<ans){
                ans=total;
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
