#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        vector<int> a(n);

        int totalTwos = 0;
        for(int i = 0; i < n; i++){
            cin >> a[i];
            if(a[i] == 2){
                totalTwos++;
            }
        }
        if(totalTwos % 2 != 0){
            cout << -1 << endl;
            continue;
        }

        int leftTwos = 0;
        int target = totalTwos / 2;

        for(int i = 0; i < n - 1; i++){
            if(a[i] == 2){
                leftTwos++;
            }
            if(leftTwos == target){
                cout << i + 1 << endl;
                break;
            }
        }
    }
    return 0;
}

