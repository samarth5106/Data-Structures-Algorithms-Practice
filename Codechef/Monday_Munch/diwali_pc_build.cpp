#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
      
        int p,d,k,b;
         cin>>p>>d>>k>>b;
         int need=p;
         int cnt=0;
         while(cnt!=k){
             need+=d;
             cnt++;
         }
         if(b>=need) cout<<"YES"<<endl;
         else cout<<"NO"<<endl;
        
        
    }

}
