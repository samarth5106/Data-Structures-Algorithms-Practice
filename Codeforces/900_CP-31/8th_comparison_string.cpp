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
        long long longest=1;
        long long current=1;
        for(int i=1;i<n;i++){
            if(s[i]==s[i-1]){
                current++;
            }
            else{
                longest=max(longest,current);
                current=1;
            }
        }
        longest=max(longest,current);
        cout<<longest+1<<endl;
    }
}
