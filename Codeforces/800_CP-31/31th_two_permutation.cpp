#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    if(!(cin >> t)) return 0;
    while (t--) {
        long long n, a, b;
        cin >> n >> a >> b;

        if (a + b + 2 <= n) {
            cout << "YES\n";
        } else {
            if (a == n && b == n) cout << "YES\n";
            else cout << "NO\n";
        }
    }
    return 0;
}
