#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
            long long int a, b, c;
    cin >> a >> b >> c;

    // write solution here
    if(a+c == b+c) {
        if(c % 2 != 0){
            cout << "First" << endl;
        }else{
            cout << "Second" << endl;
        }
    }
    else if(a+c > b+c){
        cout << "First" << endl;
    }
    else cout << "Second" << endl;
    }
}
