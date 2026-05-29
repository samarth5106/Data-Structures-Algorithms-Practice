#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> a(n);
        map<int,int> freq;
        int m=0;
        for(int i=0;i<n;i++){
            cin>>a[i];
            freq[a[i]]++;
            if(freq[a[i]]>m){
                m=freq[a[i]];
            }
        }
        int ans=n-m+1;
        cout<<ans<<endl;
    }
    return 0;
}
