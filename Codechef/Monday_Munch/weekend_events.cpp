#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
       vector<array<int,3>> v(n);
        int ans=0;
        
        for(int i=0;i<n;i++){
            cin>>v[i][0]>>v[i][1]>>v[i][2];
        }
        sort(v.begin(),v.end(),[](auto a,auto b){
            return a[1]<b[1];
        });
        
        
        vector<long long> dp(n+1,0);
        
        for(int i=1;i<=n;i++){
            long long attnd=v[i-1][2];
            int j=i-1;
            while(j>0&&v[j-1][1]>v[i-1][0]){
                j--;}
                
                attnd+=dp[j];
                
                dp[i]=max(dp[i-1],attnd);
                
            
        }
        
        cout<<dp[n]<<endl;
        
    }

}
