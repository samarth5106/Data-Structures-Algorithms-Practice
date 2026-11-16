#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
       string s,r;
       cin>>s;
       cin>>r;
       string m;
       for(int i=0;i<s.length();i++){
           if(s[i]==r[i]){
               m+='G';
           }
           else m+='B';
       }
       cout<<m<<endl;
        
        
    }

}
