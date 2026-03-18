#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n,k;
        cin>>n;
        cin>>k;
        vector<int> vec(n+1);
        vector<int> s;
        for(int i=1;i<=n;i++){
            cin>>vec[i];
            if(vec[i]==1){
                s.push_back(i);
            }
        }
        bool done=true;
        if(s.size()!=0){
            for(int i=0;i<s.size()-1;i++){
            if(abs(s[i]-s[i+1])<=k){
                cout<<"No"<<endl;done=false;
                break;
            }
        }
        }
        
        if(!done) continue;
        
        for(int i=1;i<=n;i++){
            if(vec[i]==0){
                bool covr=false;
                for(int j=max(1,(i-k));j<=min(n,i+k);j++){
                    if(vec[j]==1){
                        covr=true;
                        break;
                    }
                   
                }
                 if (!covr) {
                    cout << "No" << endl;
                    done = false;
                    break;
                }
             
            }
        }
        if(done)cout<<"Yes"<<endl;
        
        
        
    }

}
