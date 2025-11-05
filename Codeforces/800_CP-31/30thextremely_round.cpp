

#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int digits = to_string(n).length();
        int firstDigit = n / (int)pow(10, digits - 1);
        int count = 9 * (digits - 1);
        count += firstDigit;
        cout << count << endl;
    }
    return 0;
}
