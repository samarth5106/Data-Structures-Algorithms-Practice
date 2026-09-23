#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    string s;
    cin>>s;
   // string ans="";
   int n=s.length();
    for(int i=0;i<n;i++){
  
        cout<<s[i];
        if(i==n-1) break;
      cout<<'g';
    }
    
   // cout<<ans<<endl;
    return 0;
}
