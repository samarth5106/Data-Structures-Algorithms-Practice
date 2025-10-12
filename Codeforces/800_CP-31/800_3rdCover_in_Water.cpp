#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string s;
        cin>>s;
        int l=0,r=2;
        int dot=0;
        int dt=0;
        for(int i=l;i<=r;i++){
            if(s[i]=='.'){
                dot++;
            }
        }
        if(dot==3){
            cout<<2<<endl;
            continue;
        }
        dt=dot;
        while(r<n-1){
            if(s[l]=='.'){
                dot--;
            }
            l++;
            r++;
            if(s[r]=='.'){
                dot++;
                dt++;
            }
            if(dot==3){
                break;
            }
        }
        if(dot==3){
            cout<<2<<endl;
        }
        else{
            cout<<dt<<endl;
        }
    }
    return 0;
}
