#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;

        vector<long long> a(n);
        long long x=0;
        for(int i=0;i<n;i++){
            cin>>a[i];
            x|=a[i];
        }
        long long cur=0;
        int segments=0;
        for(int i=0;i<n;i++){
            cur|=a[i];
            if(cur==x){
                segments++;
                cur=0;
            }
        }
        cout<<n-segments<<"\n";
    }

    return 0;
}
