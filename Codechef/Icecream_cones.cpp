#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int x,y,n;
        cin>>x>>y>>n;
        while(n--){
            x-=y;
            if(x<0){
                x=0;
                break;
            }
        }
        cout<<x<<endl;
        
        
    }

}
