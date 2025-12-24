#include <bits/stdc++.h>
using namespace std;

static const long long MOD = 998244353;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t;
    cin >>t;
    while (t--) {
       long long n,m;
       cin>>n>>m;
        if (n==1) {
            cout <<(m+1)%MOD<<'\n';
            continue;
        }
        long long hittst =1LL<<(63- __builtin_clzll(m));

        long long answr=2*((m+1-hittst)%MOD);
        answr%=MOD;

        cout<<answr<<'\n';
    }

    return 0;
}
