#include <bits/stdc++.h>
using namespace std;
 
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string s;
        cin>>s;
        int cnt=0;
        vector<int> done(n);
        int curr=0;
        for(int i=0;i<n;i++){
            if(done[curr]==0){
                cnt++;
                done[curr]=1;
            }
            if(s[curr]=='R'){
                curr++;
            }
            else{
                curr--;
            }
        }
        cout<<cnt<<endl;
       
        
        
    }
 
}
