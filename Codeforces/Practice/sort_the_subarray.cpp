
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> vec(n);
        for (int i = 0; i < n; i++) {
            cin >> vec[i];
        }
        vector<int> adash(n);
        for (int i = 0; i < n; i++) {
            cin >> adash[i];
        }
        
        int a = -1, b = -1;
        int strt = -1, end = -1;
        
        for (int i = 0; i < n; i++) {
            if (vec[i] != adash[i]) {
                if (strt == -1) {
                    strt = i;
                }
                end = i;
            }
        }
        
        if (strt == -1) {
            cout << 1 << " " << n << endl;
            continue;
        }
        
        while (strt > 0 && adash[strt - 1] <= adash[strt]) {
            strt--;
        }
        while (end < n - 1 && adash[end] <= adash[end + 1]) {
            end++;
        }
        
        a = strt;
        b = end;
        
        cout << a + 1 << " " << b + 1 << endl;
    }
    return 0;
}
