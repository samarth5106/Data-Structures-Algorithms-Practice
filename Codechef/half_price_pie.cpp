#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> dvec(n);
        int sum=0;
        for(int i=0;i<n;i++){
            cin>>vec[i];
           sum+=vec[i];
        }
        int minpr=vec[0]+vec[1];
        for(int i=0;i<n-1;i++){
            minpr=min(minpr,vec[i]+vec[i+1]);
        }
        cout<<sum-(minpr/2)<<endl;
        
        
        
    }

}
