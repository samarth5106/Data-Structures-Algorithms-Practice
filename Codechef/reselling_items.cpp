#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n;
        cin >>k;

        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        int ans=0;
        sort(vec.begin(),vec.end(),greater<int>());
        for(int i=0;i<n;i++){
            if(i<k){
                if(vec[i]>5){
                    ans+=vec[i]-5;
                }
            }
            else{
                if(vec[i]>10){
                    ans+=vec[i]-10;
                }
            }
        }
        cout<<ans<<endl;
        
    }

}
