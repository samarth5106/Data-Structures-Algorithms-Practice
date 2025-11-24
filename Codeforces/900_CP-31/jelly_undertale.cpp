#include<bits/stdc++.h>
using namespace std;
 int main(){
     int t;
     cin>>t;
     while(t--){
        int a,b,n;
        cin>>a>>b>>n;
        vector<int> x(n);
        for(int i=0;i<n;i++){
            cin>>x[i];
        }
        long long current=b;
            for(int i=0;i<n;i++){
                current+=min(x[i],a-1);
            }
            cout<<current<<endl;

     }
 }
