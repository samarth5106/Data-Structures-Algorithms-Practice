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
        int initial_beauty=0;
        vector<int> trans;
        for(int i=0;i<n-1;i++){
            if(s[i]==s[i+1]){
                initial_beauty++;
            }
            else trans.push_back(i);
        }
        if(trans.empty()){
            cout<<initial_beauty<<endl;
            continue;
        }
        bool gain2=false;
        bool seen0=false;
        bool seen1=false;
        
        for(int idx:trans){
            if(s[idx]=='0'){
                if(seen0) gain2=true;
                seen0=true;
                
                
            }
            
                else{
                    if(seen1) gain2=true;
                    seen1=true;
                }
        }
        if(gain2){
            cout<<initial_beauty+2<<endl;
            continue;
        }
        bool gain1=false;
        if(s[0]==s[n-1]){
            gain1=true;
        }
        else{
            for(int idx:trans){
                if(s[idx]==s[n-1]||s[idx+1]==s[0]){
                    gain1=true;
                    break;
                }
            }
        }
        if(gain1){
            cout<<initial_beauty+1<<endl;
        }
        else{
            cout<<initial_beauty<<endl;
        }
        
        
        
    }
    return 0;

}
