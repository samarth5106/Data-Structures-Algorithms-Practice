#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    string s;
	    cin>>s;
	    int zro=0,one=0;
	    int ans=0;
	    for(int i=0;i<n;i++){
	        if(s[i]=='0')
	        zro++;
	        else
	        one++;
	        if(one>=zro)
	        ans++;
	        }
	        cout<<ans<<endl;
	}

}
