#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n>>k;
        vector<long long> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        sort(a.begin(),a.end());
        vector<long long> pref(n+1,0);
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+a[i];
        }
        long long max_sum=0;
        for(int i=0;i<=k;i++){
            int left_del=2*i;
            int right_del=k-i;
            int start_idx=left_del;
            int end_idx=n-1-right_del;
            if(start_idx<=end_idx+1){
                long long current_sum=pref[end_idx+1]-pref[start_idx];
                max_sum=max(max_sum,current_sum);
            }
        }
        cout<<max_sum<<"\n";
    }
    return 0;
}
