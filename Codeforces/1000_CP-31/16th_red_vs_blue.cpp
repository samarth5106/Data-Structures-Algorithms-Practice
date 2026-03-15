#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int r,b;
        cin>>r>>b;
        string s="";
     // int each = (r + b) / (b + 1);
        int p;
        while(r>0&&b>0){
           int each=(r+b)/(b+1);
            
            while(each--){
                s+='R';
                r--;
            }
            s+='B';
            b--;
        }
        if(b!=0){
            while(b--){
                s+='B';
            }
        }
         if(r!=0){
            while(r--){
                s+='R';
            }
        }
        
        cout<<s<<endl;
        
        
        
    }

}
