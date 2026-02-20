#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        long long sum=0;
        int total=n;
        int tosub;
        int toadd;
        int mn1=INT_MAX;
        int mn2=INT_MAX;
        while(n--){
            int m;
            cin>>m;
            vector<int>a(m);
            for(int i=0;i<m;i++){
                cin>>a[i];
            }
            sort(a.begin(),a.end());
            int mini=a[0];
            int secmini=a[1];
            sum+=secmini;
            if(mini<mn1){
                mn1=mini;
            }
            if(secmini<mn2){
                mn2=secmini;
            }
        }
        sum=sum-mn2+mn1;
        cout<<sum<<endl;
    }
}
