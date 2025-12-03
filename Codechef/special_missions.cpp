#include <bits/stdc++.h>
using namespace std;

int main() {
        int t;
        cin >> t;
        while(t--){
        int N,C;
        cin >>N>>C;
        vector<int> A(N);
        for (int i = 0; i <N; i++) {
            cin >> A[i];
        }
        string S;
        cin >> S;
        int sum0_= 0;
        int sum1_= 0;

        for (int i = 0; i <N; i++) {
            if (S[i] == '0') sum0_= sum0_ + A[i];
            else if(S[i] != '0') sum1_= sum1_+ A[i];
        }
        int ans = sum0_; 
        if (C<= sum0_) {
            ans = max(ans, sum0_- C + sum1_);
        }
        cout<<ans<<endl;
    }
    return 0;
}
