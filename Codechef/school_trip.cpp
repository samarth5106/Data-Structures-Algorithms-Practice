#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int nhua, xhua, khua;
        cin >> nhua >> xhua >> khua;

        int ramu = xhua%khua;
        int ans = xhua;              
        ans = min(ans, ramu);
        if (xhua + (khua - ramu) <= nhua) {  
            ans = min(ans, khua - ramu);
        }

        cout << ans << "\n";
    }
    return 0;
}
