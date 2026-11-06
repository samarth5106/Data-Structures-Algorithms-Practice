#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;

        vector<long long> a(n);
        long long total = 0;

        for (int i = 0; i < n; i++) {
            cin >> a[i];
            total += a[i];
        }

        long long prefix = 0;
        long long ans = 0;

        for (int i = 0; i < n - 1; i++) {
            prefix += a[i];

            long long g = gcd(prefix, total - prefix);
            ans = max(ans, g);
        }

        cout << ans << "\n";
    }

    return 0;
}
