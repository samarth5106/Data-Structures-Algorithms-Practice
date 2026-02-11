#include <bits/stdc++.h>
using namespace std;
int main() {
    int x;
    cin >> x;
    int scheme1 = 100 + 4 * x;
    int scheme2 = 300;
    cout << min(scheme1, scheme2) << endl;
    return 0;
}
