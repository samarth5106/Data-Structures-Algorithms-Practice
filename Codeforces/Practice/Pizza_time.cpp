#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while(t--) {
        int n;
        cin >> n;
        int ans = 0;
        while(n >= 3) {
            int take = n / 3;
            ans += take;
            n -= take * 2;
        }
        cout << ans << endl;
    }
}
