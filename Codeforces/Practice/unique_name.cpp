#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> a(n);
        int mini=INT_MAX;
      
        for (int i = 0; i < n; i++) {
            cin >> a[i];
            mini=min(mini,a[i]);
        }
        int ans;
        for(int i=2;i<mini;i++){
            if(mini%i!=0){
                ans=i;break;
            }
        }
        cout<<ans<<endl;


    }
}
