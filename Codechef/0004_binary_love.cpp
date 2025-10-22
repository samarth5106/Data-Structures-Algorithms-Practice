#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        int n; string s;
        cin >> n >> s;
        bool has01 = s.find("01") != string::npos;
        bool has10 = s.find("10") != string::npos;
        cout << (has01 && has10 ? "Alice\n" : "Bob\n");
    }
    return 0;
}
