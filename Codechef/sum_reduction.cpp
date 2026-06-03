#include <bits/stdc++.h>
using namespace std;

int main() {
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<long long> vec(n);
        long long sum = 0;
        long long total_or = 0;
        
        for(int i=0; i<n; i++){
            cin>>vec[i];
            sum += vec[i];
            total_or |= vec[i];
        }
        
        if(sum == total_or){
            cout<<"YES\n";
        } else {
            cout<<"NO\n";
        }
    }
    return 0;
}
