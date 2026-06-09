#include <bits/stdc++.h>
using namespace std;

const long long MOD = 1000000007;

void solve() {
    int n;
    cin >> n;

    vector<long long> a(n), b(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> b[i];
    }

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    long long ans = 1;

    // Highest constraints first (backwards loop)
    for (int i = n - 1; i >= 0; i--) {
        // Total elements in 'a' strictly greater than b[i]
        long long cnt = a.end() - upper_bound(a.begin(), a.end(), b[i]);

        // Subtracting already booked elements for larger b[i]
        cnt -= (n - 1 - i);

        if (cnt <= 0) {
            ans = 0;
            break;
        }

        ans = (ans * cnt) % MOD;
    }

    cout << ans << "\n";
}

int main() {
    // Fast I/O
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }

    return 0;
}
