#include<bits/stdc++.h>
using namespace std;

int gcd(int a, int b){
    return b == 0 ? a : gcd(b, a % b);
}

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> a(n);
        for(int i = 0; i < n; i++){
            cin >> a[i];
        }
        bool found = false;
        for(int i = 0; i < n && !found; i++){
            for(int j = i + 1; j < n; j++){
                if(gcd(a[i], a[j]) <= 2){
                    found = true;
                    break;
                }
            }
        }
        if(found){
            cout << "Yes" << endl;
        } else {
            cout << "No" << endl;
        }
    }
    return 0;
}
