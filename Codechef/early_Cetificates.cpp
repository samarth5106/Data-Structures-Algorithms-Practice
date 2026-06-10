#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
       int n,m;
       cin>>n>>m;
       string a;
       cin>>a;
       string b;
       cin>>b;
       
       string ans="";
       if(a==b){
           ans=a;
           
       }
       else{
           for(int i=0;i<min(n,m);i++){
               if(a[i]==b[i]){
                   ans+=a[i];
               }
               else break;
           }
       }
       cout<<ans<<endl;
       
        
        
    }

}
