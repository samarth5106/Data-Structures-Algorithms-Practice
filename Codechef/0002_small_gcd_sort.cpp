#include <bits/stdc++.h>
using namespace std;

int gcd(int i, int n) {
    while (i != 0 && n != 0) {
        if (i > n)
            i = i % n;
        else
            n = n % i;
    }
    return (i == 0) ? n : i;
}

int main() {
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        
        // Map: score -> list of players
        map<int, vector<int>, greater<int>> unmp;
        
        for(int i = 1; i <= n; i++){
            int k = gcd(i, n);
            unmp[k].push_back(i);
        }
        
        vector<int> result;
        for(auto& p : unmp){
           
            for(int player : p.second){
                result.push_back(player);
            }
        }
        
        for(int i = 0; i < result.size(); i++){
            cout << result[i] << " ";
        }
        cout << endl;
    }
}
