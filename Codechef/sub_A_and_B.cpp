#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
       int a,b;
       cin>>a>>b;
       int decr=a-b;
       while(n>=a){
           n-=decr;
       }
        
        cout<<n<<endl;
    }

}
