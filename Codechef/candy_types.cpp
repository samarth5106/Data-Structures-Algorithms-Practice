#include<bits/stdc++.h>
using namespace std;

int main(){
 

   int t;
   cin>>t;
   while(t--){
        int n;
    cin>>n;
    unordered_map<int,int> mp;
    int x;
    for(int i=0;i<n;i++){
        cin>>x;
        mp[x]++;
    }

    int ans=-1;
    int mx=0;

    for(auto &p:mp){
        if(p.second>mx || (p.second==mx && p.first<ans)){
            mx=p.second;
            ans=p.first;
        }
    }

    cout<<ans<<"\n";
   }
    return 0;
}
