#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        
        int ones = 0, twos = 0, threes = 0;
        
        for(int i = 0; i < n; i++){
            int x;
            cin >> x;
            if(x == 1) ones++;
            else if(x == 2) twos++;
            else threes++;
        }
        
        int dele= min(ones, threes) + max(0, twos - 1);
        cout << dele << endl;
    }
    return 0;
}
