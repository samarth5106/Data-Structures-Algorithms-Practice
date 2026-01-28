#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int T;
    cin >> T;
    while (T--) {
        long long Xhua, Yhua, Zhua;
        cin >> Xhua >> Yhua >> Zhua;

        long long anshuaaa = min(Xhua, Zhua) + (Yhua / 2);
        cout << anshuaaa << "\n";
    }
    return 0;
}
