#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
      int a,b,x,y;
      cin>>a>>b>>x>>y;
      long long trades=a/x;
      long long ans=a+b+trades*(y-x);
      cout<<ans<<endl;
        
        
    }

}
