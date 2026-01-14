#include <bits/stdc++.h>
using namespace std;

bool hasOddDigit(long long n) {
    while (n > 0) {
        if ((n % 10) % 2 == 1) return true;
        n /= 10;
    }
    return false;
}

int maxDigit(long long n) {
    int mx = 0;
    while (n > 0) {
        mx = max(mx, (int)(n % 10));
        n /= 10;
    }
    return mx;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    while (T--) {
        long long N;
        cin >> N;

        if (N % 2 == 1) {
            cout << 0 << "\n";
            continue;
        }

        int ops = 0;
        if(N<10){
        cout<<-1<<endl;continue;}

        while (!hasOddDigit(N)) {
            int d = maxDigit(N);
            N -= d;
            ops++;
        }

        ops++;

        cout << ops << "\n";
    }
    return 0;
}
