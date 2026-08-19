#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        
        vector<int> arr(2*n);
        for(int i=0;i<2*n;i++){
            cin>>arr[i];
           
        }
        int ans=0;
        
        for(int i=0;i<n;i++){
            ans+=max(arr[i],arr[2*n-i-1]);
        }
        
        cout<<ans<<endl;
        
        
    }

}
