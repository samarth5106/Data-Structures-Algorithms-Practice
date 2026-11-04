#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int c;
        cin>>c;
        vector<int> vec(n+1);
        vec[0]=0;
        vector<int> simple(n+1);
       simple[0]=0;
       
        for(int i=1;i<n+1;i++){
            cin>>vec[i];
            simple[i]=i+vec[i];
           
        }
        
        int cnt=0;
        
        sort(simple.begin(),simple.end());
       
        int i=1;
        while(i<=n&&c>=simple[i]){
            c-=simple[i];
            cnt++;
            i++;
            
        }
        cout<<cnt<<endl;
        
        
        
    }

}
