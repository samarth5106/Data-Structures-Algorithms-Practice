#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        long long a,b;
        cin>>a>>b;

        long long mx=max(a,b);
        long long mn=min(a,b);

        if(mx%mn!=0){
            cout<<-1<<endl;
            continue;
        }

        long long ratio=mx/mn;

        if((ratio&(ratio-1))!=0){
            cout<<-1<<endl;
            continue;
        }

        int k=0;

        while(ratio>1){
            ratio/=2;
            k++;
        }

        int ans=0;

        ans+=k/3;
        k%=3;

        ans+=k/2;
        k%=2;

        ans+=k;

        cout<<ans<<endl;
    }

    return 0;
}
