#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int k;
        cin>>k;
        int cnt=0;
        int x=1;
        while(x+k<=n){
            cnt++;
            x=x+k;
        }
        cout<<x<<endl;
        
        
    }

}
