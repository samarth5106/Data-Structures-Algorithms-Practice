#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<vector<int>> vec(n,vector<int>(n,0));
        long long k;
        cin>>k;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cin>>vec[i][j];
            }
        }
        int strtro=0;
        int endro=n-1;
        long long cnt=0;
        
        while(strtro!=n){
            for(int j=0;j<n;j++){
                if(vec[strtro][j]!=vec[endro][(n-1)-j]){
                    vec[strtro][j]=vec[endro][(n-1)-j];
                    cnt++;
                }
            }
            strtro++;
            endro--;
        }
        
        if(cnt==k)cout<<"YES"<<endl;
        
        else if(cnt<k){
            
            int rem=k-cnt;
            
            if((rem&1)==0){
                cout<<"YES"<<endl;
            }
            
            else if((rem&1)==1&&(n&1)==1) cout<<"YES"<<endl;
            else cout<<"NO"<<endl;
        }
        
        else cout<<"NO"<<endl;
        
    
        
        
    }

}
