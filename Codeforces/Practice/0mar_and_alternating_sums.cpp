#include <bits/stdc++.h>
using namespace std;

const long long MOD = 1e9+7;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t; 
    cin >> t;
    
    while(t--){
        int n; 
        cin >> n;
        
        vector<long long> a(n);
        for(int i = 0; i < n; i++){
            cin >> a[i];
        }

        int negatives = 0;
        while(negatives < n && a[negatives] == -1){
            negatives++;
        }

     
        vector<long long> unique_vals, counts;
        for(int i = negatives; i < n; i++){
            if(!unique_vals.empty() && unique_vals.back() == a[i]){
                counts.back()++;
            }else{
                unique_vals.push_back(a[i]);
                counts.push_back(1);
            }
        }
        
        int unique_count = unique_vals.size();
        long long positives = n - negatives;
        
        vector<long long> power2(n + 2);
        power2[0] = 1;
        for(int i = 1; i <= n + 1; i++){
            power2[i] = power2[i-1] * 2 % MOD;
        }

        long long factor0 = 1;
        if(positives != 0){
            factor0 = power2[positives - unique_count];
        }

        int consecutive_pairs = 0;
        for(int i = 0; i + 1 < unique_count; i++){
            if(unique_vals[i+1] == unique_vals[i] + 1){
                consecutive_pairs++;
            }
        }
        long long factor_neg1 = factor0 * consecutive_pairs % MOD;

        long long ans = 0;
        if(negatives == 0){
            ans = factor0;
        }else{
            ans = power2[negatives - 1] * ((factor0 + factor_neg1) % MOD) % MOD;
        }

        cout << ans << "\n";
    }
    return 0;
}
