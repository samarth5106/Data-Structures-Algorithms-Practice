#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int x,y;
        cin>>x>>y;
        int ans=0;
        bool isit=false;
        if(n>3) isit=true;
        if(n<=3){
            ans=n*x;
        }
        else{
            ans=3*x;
            
            n-=3;
            ans+=n*y;
        }
        cout<<ans<<endl;
        
        
        
    }

}
