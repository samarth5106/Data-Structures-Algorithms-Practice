#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int k;
        cin>>k;
        string s;
        cin>>s;
        int i=0;
        int j=k;
        while(j<n){
            if(s[i]=='1'){
                s[i]='0';
                s[j]=s[j]^1;
            }
            i++;
            j++;
            
        }
        bool allgood=true;
        for(char c:s){
            if(c=='1'){
                allgood=false;break;
            }
        }
        if(allgood) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }

}
