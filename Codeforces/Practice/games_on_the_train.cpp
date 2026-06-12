#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        
        int maxi=0;
        int mini=INT_MAX;
        for(int i=0;i<n;i++){
            cin>>vec[i];
           maxi=max(vec[i],maxi);
           mini=min(vec[i],mini);
        }
        // maxi+1)-mini
        cout<<maxi+1-mini<<endl;
    }

}
