#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        string s;
        cin >> s;

        int n = s.size();

        if (count(s.begin(), s.end(), '1') == n) {
            cout << 1LL * n * n << "\n";
            continue;
        }

        if (count(s.begin(), s.end(), '1') == 0) {
            cout << 0 << "\n";
            continue;
        }

        string temp = s + s;

        int cnt = 0, k = 0;

        for (char ch : temp) {
            if (ch == '1') {
                cnt++;
                k = max(k, cnt);
            } else {
                cnt = 0;
            }
        }

        k = min(k, n);

        long long ans = 1LL * (k + 1) * (k + 1) / 4;

        cout << ans << "\n";
    }

    return 0;
}
