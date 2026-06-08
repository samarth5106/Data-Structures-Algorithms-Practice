#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        long long x;
        cin>>x;
        vector<long long> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        long long l=1;
        long long h=2e9;
        long long hgt=1;
        while(l<=h){
            long long mid=l+(h-l)/2;
            long long ans=0;
            for(int i=0;i<n;i++){
                if(mid>vec[i]){
                    ans+=mid-vec[i];
                }
            }
            if(ans<=x){
                hgt=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        cout<<hgt<<"\n";
    }
    return 0;
}
