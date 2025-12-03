#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n,k;
        cin >>n>>k;
        string str;
        cin>>str;

        int zros=count(str.begin(), str.end(),'0');
        int ons=n-zros;
        vector<int> chain_len(k, 0);

        for (int i=0;i<n;i++) {
            chain_len[i % k]++;
        }

        int min0= 0,max0= 0;

        for (int j : chain_len) {
            min0 += j / 2;
            max0 += (j + 1) / 2;
        }

        if (zros>= min0 && zros <= max0)
            cout <<"YES\n";
        else
            cout << "NO\n";
    }
}
