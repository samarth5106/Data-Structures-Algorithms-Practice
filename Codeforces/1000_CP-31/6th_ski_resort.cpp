#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n,k,q;
        cin>>n>>k>>q;

        vector<int>vec(n);
        for(int i=0;i<n;i++)
            cin>>vec[i];

        long long cnt=0;
        int i=0;

        while(i<n){
            if(vec[i]<=q){
                int l=i;
                while(i<n && vec[i]<=q)
                    i++;
                int size=i-l;
                if(size>=k)
                    cnt+=1LL*(size-k+1)*(size-k+2)/2;
            }
            else{
                i++;
            }
        }

        cout<<cnt<<endl;
    }
}
