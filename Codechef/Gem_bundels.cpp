#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int r,b,g;
	    cin>>r>>b>>g;
	    int mini=min(r,b);
	    mini=min(mini,g);
	    int ans=mini*10;
	    r=abs(r-mini);
	    b=abs(b-mini);
	    g=abs(g-mini);
	    ans+=(r+b+g)*3;
	    cout<<ans<<endl;
	    
	}
	

}
