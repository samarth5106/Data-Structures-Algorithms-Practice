#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int levl=vec[i];
            int cntlow=0;
            int cnth=0;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(vec[j]<=levl) cntlow++;
                else cnth++;
            }
            if(cntlow+1>cnth) ans++; 
        }
        
        cout<<ans<<endl;
        
            
        
        
    }

}
