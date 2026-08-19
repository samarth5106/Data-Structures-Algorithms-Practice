#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
         long long N, K;
    cin >> N >> K;
    vector<long long> A(N+1);
    for(int i=1;i<=N;i++) cin >> A[i];

    long long sum = 0, mx = 0;
    int ans = 0;
    for(int i=1;i<=N;i++){
        sum += A[i];
        mx = max(mx, A[i]);
        long long cost = sum - mx;
        if(cost <= K) ans = i;
        else break; 
    }
    cout << ans << endl;
    }
   
}
