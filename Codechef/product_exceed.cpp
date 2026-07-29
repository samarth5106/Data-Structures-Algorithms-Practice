#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
       int x,y,p;
       cin>>x>>y>>p;
       //x*y>=p
       //min opeatrations
       int cnt=0;
       while(x*y<p){
           cnt++;
           if(x<y) x++;
           else y++;
       }
       cout<<cnt<<endl;
        
        
    }

}
