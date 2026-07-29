#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
       int x,y,z;
       cin>>x>>y>>z;
       int current=0;
       int cnt=0;
       if(z<=y){cout<<"-1"<<endl;continue;}
       while(current<x){
           x+=y;
           cnt++;
       current+=z;
       }
      
       cout<<cnt<<endl;
        
        
    }

}
