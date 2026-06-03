#include <bits/stdc++.h>
using namespace std;

int main() {
    // Fast I/O
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            cin>>vec[i];
            if(vec[i]%2!=0){
                odd++;
            }
            else {
                even++;
            }
        }
        
        if(odd%2==0){
            if(even>0){
                cout<<"YES\n";
            }
            else {
                cout<<"NO\n";
            }
        } 
        else {
            cout<<"YES\n";
        }
    }
    return 0;
}
