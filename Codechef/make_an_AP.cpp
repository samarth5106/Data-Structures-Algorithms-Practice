#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        vector<int> vec(n);
        for(int i = 0; i < n; i++){
            cin >> vec[i];
        }
        int g = 0;
        for(int i = 1; i < n; i++){
            int diff = vec[i] - vec[i-1];
            g =gcd(g, diff);
        }
        int opn = 0;
        for(int i = 1; i < n; i++){
            int diff = vec[i] - vec[i-1];
            opn += (diff / g) - 1;
        }
        
        cout << opn << endl;
    }
    
    return 0;
}
