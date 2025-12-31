#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<ll> a(n);
        for (int i = 0; i < n; i++) cin >> a[i];
        ll mx = a[0];
        for (int i = 1; i < n; i++) {
            mx = mx + 2 * a[i];
        }
        ll mn = a[n-1];
        for (int i = n-2; i >= 0; i--) {
            mn = a[i] + 2 * mn;
        }
        cout << mx << " " << mn << "\n";
    }
}
