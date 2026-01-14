#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin >> T;
    while (T--) {
        int N, A, B;
        cin >> N >> A >> B;

        vector<int> temp(N);
        for (int i = 0; i < N; i++) {
            cin >> temp[i];
        }

        int jacket = 0;    
        bool wearing = false;

        for (int i = 0; i < N; i++) {
            if (!wearing && temp[i] < A) {
             
                jacket++;
                wearing = true;
            }
            else if (wearing && temp[i] > B) {

                wearing = false;
            }
        }

        cout << jacket << endl;
    }
    return 0;
}
