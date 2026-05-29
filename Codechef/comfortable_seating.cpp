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
        sort(vec.begin(), vec.end());
        
        bool verdict = true;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            
            if (i == 0) {
                if (vec[n - 1] <= vec[i]) cnt++;
                if (i + 1 < n && vec[i + 1] <= vec[i]) cnt++;
            }
            else if (i != n - 1) {
                if (vec[i - 1] <= vec[i]) cnt++;
                if (i + 1 < n && vec[i + 1] <= vec[i]) cnt++;
            }
            else {
                if (vec[i - 1] <= vec[i]) cnt++;
                if (vec[0] <= vec[i]) cnt++;
            }
            
            if (cnt == 0) {
                verdict = false;
                break;
            }
        }
        
        if (!verdict) cout << "NO" << endl;
        else cout << "YES" << endl;
    }
    return 0;
}
