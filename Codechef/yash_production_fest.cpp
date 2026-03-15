#include<bits/stdc++.h>
using namespace std;

long long check(long long mid,vector<int>&a,int n){
    long long cnt=0;
    for(int i=0;i<n;i++){
        cnt+=mid/a[i];
    }
    return cnt;
}

int main(){

    int n;
    long long t;
    cin>>n>>t;

    vector<int>a(n);
    int mini=INT_MAX;

    for(int i=0;i<n;i++){
        cin>>a[i];
        mini=min(mini,a[i]);
    }

    long long low=1;
    long long high=1LL*mini*t;
    long long ans=high;

    while(low<=high){

        long long mid=(low+high)/2;

        if(check(mid,a,n)>=t){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }

    cout<<ans<<endl;
}
