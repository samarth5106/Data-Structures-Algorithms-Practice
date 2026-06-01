#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    
        int n;
        cin>>n;
        string s;
        cin>>s;
        bool done=false;
        int l=0,r=0;
        for(int i=0;i<n-1;i++){
            if(s[i]>s[i+1]){
                l=i+1;r=i+2;done=true;break;
            }
        }
        if(!done){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"YES"<<endl;
            cout<<l<<" "<<r;
        }
        
        
    

}
