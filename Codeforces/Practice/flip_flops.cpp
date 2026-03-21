#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n;
        long long c,k;
        cin>>n>>c>>k;
        vector<long long> vec(n);
        for(int i=0;i<n;i++) cin>>vec[i];
        sort(vec.begin(),vec.end());
        for(int i=0;i<n;i++){
            if(vec[i]<=c){
                long long add=min(k,c-vec[i]);
                vec[i]+=add;
                k-=add;
                c+=vec[i];
            }
        }
        cout<<c<<"\n";
    }
    return 0;
}
