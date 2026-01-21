#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;                  // FIX 1
        vector<int> a(n);        // FIX 2

        for(int i=0;i<n;i++){
            cin>>a[i];
        }

        int cost=0;
        int remain=n;

        for(int i=n-1;i>=0;i--){
            if(a[i]==remain){
                remain--;
            }
            else{
                cost=a[i];
                break;
            }
        }

        cout<<cost<<"\n";
    }
    return 0;
}
