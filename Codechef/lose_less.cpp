#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;

    while(t--){
        long long m,n;
        cin>>m>>n;

        long long w=max(0LL,n-m);
        w=(w+1)/2;

        long long d=n-3*w;

        long long l=m-w-d;

        cout<<l<<endl;
    }

    return 0;
}
