#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n,x;
        cin>>n>>x;

        vector<long long>a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }

        long long L=a[0]-x;
        long long R=a[0]+x;
        int changes=0;

        for(int i=1;i<n;i++){
            long long newL=a[i]-x;
            long long newR=a[i]+x;

            if(max(L,newL)<=min(R,newR)){
                L=max(L,newL);
                R=min(R,newR);
            }
            else{
                changes++;
                L=newL;
                R=newR;
            }
        }

        cout<<changes<<endl;
    }
}
