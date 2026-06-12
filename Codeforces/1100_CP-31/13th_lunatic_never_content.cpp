#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        if(n==1){
            cout<<"0"<<endl;continue;
        }
        bool pal=true;
        for(int i=0;i<n/2;i++){
            if(a[i]!=a[n-1-i]){
                pal=false;
                break;
            }
        }
        
        if(pal){ cout<<"0"<<endl;continue;}
        
        
       int g=0;

for(int i=0;i<n/2;i++){
    g=gcd(g,abs(a[i]-a[n-1-i]));
}

cout<<g<<endl;
        
        
        
    }

}
