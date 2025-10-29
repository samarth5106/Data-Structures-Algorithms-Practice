#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        
        int S = 0;
        for(int i = 0; i < n; i++){
            int a;
            cin >> a;
            S ^= a;
        }
        
        if(n % 2 == 1){
            cout << S << endl;  // x = S works
        }
        else{
            if(S == 0){
                cout << 0 << endl;  // Any x works, print 0
            }
            else{
                cout << -1 << endl;  // Impossible
            }
        }
    }
    
    return 0;
}
