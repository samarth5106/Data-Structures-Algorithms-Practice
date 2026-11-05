#include <bits/stdc++.h>
using namespace std;

// long long solve(int i, vector<int>arr,vector<long long> dp){
//     if(i==arr.size()-1){
//         return arr[i];
//     }
//     if(dp[i]!=-1) return dp[i];
    
//     arr[i+1]=-1*arr[i+1];
//     arr[i]=-1*arr[i];
//     long long change=(arr[i])+solve(i+1,arr,dp);
    
//     arr[i+1]=-1*arr[i+1];
//     arr[i]=-1*arr[i];
//     long long notchange=arr[i]+solve(i+1,arr,dp);
    
//     return dp[i]=max(change,notchange);
// }
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> arr(n);
        for(int i=0;i<n;i++){
            cin>>arr[i];
           
        }
        // if both positive then dont do anything
        //all positive - no operation
        //all neg - if(n is odd) at the end 1 elment will remain so jo largest negative rhega leave it as it is
        //all neg - even means all positive treat it as
        
      if (n == 1) {
        cout << arr[0] << "\n";
        return 0;
    }

    vector<vector<long long>> dp(n, vector<long long>(2, 0));

    dp[n - 1][0] = arr[n - 1];
    dp[n - 1][1] = -arr[n - 1];

    for (int i = n - 2; i >= 0; i--) {
        long long change0 = -arr[i] + dp[i + 1][1];
        long long notchange0 = arr[i] + dp[i + 1][0];
        dp[i][0] = max(change0, notchange0);

        long long change1 = arr[i] + dp[i + 1][1];
        long long notchange1 = -arr[i] + dp[i + 1][0];
        dp[i][1] = max(change1, notchange1);
    }

    long long ans = dp[0][0];
    cout << ans << "\n";


        
        
    }

}
