#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while(t--){
        int n,q;
        cin>>n>>q;

        vector<long long> a(n);

        for(int i=0;i<n;i++){
            cin>>a[i];
        }

        int mn=31;
        vector<int> useful;

        for(int i=0;i<q;i++){
            int x;
            cin>>x;

            if(x<mn){
                useful.push_back(x);
                mn=x;
            }
        }

        for(int x:useful){

            long long pw=(1LL<<x);
            long long add=(1LL<<(x-1));

            for(int i=0;i<n;i++){

                if(a[i]%pw==0){
                    a[i]+=add;
                }
            }
        }

        for(int i=0;i<n;i++){
            cout<<a[i]<<" ";
        }

        cout<<"\n";
    }

    return 0;
}
