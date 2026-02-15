#include <bits/stdc++.h>
using namespace std;

int solvena(int x) {
    while (x % 2 == 0) {
        x /= 2;
    }
    return x;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> a(n + 1), sorted(n + 1);
        for (int i=1;i<=n;i++) {
            cin>>a[i];
            sorted[i]=a[i];
        }
        sort(sorted.begin()+1,sorted.end());
        unordered_map<int,int>mp;
        for (int i=1;i<=n;i++) {
            mp[a[i]]=i;
        }
        bool possiblity = true;
        for (int i=1;i<=n;i++) {
            int ori = mp[sorted[i]];
            if (solvena(ori)!=solvena(i)) {
                possiblity=false;
                break;
            }
        }
        if (possiblity)
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }
   return 0;
}
