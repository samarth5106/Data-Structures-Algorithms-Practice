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
        vector<int> a(n),b(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
           
        }
        for(int i=0;i<n;i++){
            cin>>b[i];
           
        }
        int curentmoves=k;
        int maxi=0;
        int ans=0;
        int maxb=0;
        for(int i=0;i<n;i++){
            
            ans+=a[i];
            maxb=max(maxb,b[i]);
            curentmoves--;
            
            int allb=curentmoves*maxb;
            maxi=max(maxi,ans+allb);
            if(curentmoves==0) break;
        }
        cout<<maxi<<endl;
        
        
        
    }

}
