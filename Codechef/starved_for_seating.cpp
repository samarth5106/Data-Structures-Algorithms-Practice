#include<bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while(t--){
        int n;
        long long k;
        cin>>n>>k;

        vector<long long> a(n);

        long long sum=0;

        for(int i=0;i<n;i++){
            cin>>a[i];
            sum+=a[i];
        }

        long long base=sum/2;

        vector<long long> b(n);

        for(int i=0;i<n;i++){
            b[i]=a[i]/2;
        }

        sort(b.begin(),b.end());

        long long need=k-base;

        long long ans=0;

        int l=0;
        int r=n-1;

        while(l<r){
            if(b[l]+b[r]>need){
                ans+=r-l;
                r--;
            }
            else{
                l++;
            }
        }

        cout<<ans<<"\n";
    }

    return 0;
}
