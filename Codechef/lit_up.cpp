#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int k;
        cin>>k;
        
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
        long long ans=-1;
        for(int i=1;i<=min(n,k+1);i++){
            for(int j=max(i+1,n-k);j<=n;j++){
                if(j-i<=2*k+1){
                    long long cost=vec[i-1]+vec[j-1];
                    if(ans==-1||cost<ans){
                        ans=cost;
                    }
                }
            }
        }
        cout<<ans<<endl;
        
        
    }

}
