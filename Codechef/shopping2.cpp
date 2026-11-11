#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int d;
        cin>>d;
        int suma=0;
        int sumb=0;
        int summin=0;
        vector<int> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
           suma+=a[i];
        }
        vector<int> b(n);
        for(int i=0;i<n;i++){
            cin>>b[i];
            sumb+=b[i];
            summin+=min(a[i],b[i]);
        }
        
        int ans=d+min(suma,sumb);
        ans=min(ans,summin+2*d);
        cout<<ans<<endl;
        
    }

}
