#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int ans=1;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
        sort(vec.begin(),vec.end());
        for(int i=1;i<n;i++){
            if(vec[i-1]!=vec[i])
            ans++;
        }
        cout<<ans<<endl;
        
        
    }

}
