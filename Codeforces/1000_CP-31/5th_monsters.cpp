#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        long long k;
        cin>>n>>k;
        
        vector<pair<long long,int>>v;
        
        for(int i=1;i<=n;i++){
            long long a;
            cin>>a;
            long long r=a%k;
            if(r==0) r=k;
            v.push_back({r,i});
        }
        
        sort(v.begin(),v.end(),[](auto &a,auto &b){
            if(a.first==b.first) return a.second<b.second;
            return a.first>b.first;
        });
        
        for(int i=0;i<n;i++){
            cout<<v[i].second<<" ";
        }
        cout<<endl;
    }
}
