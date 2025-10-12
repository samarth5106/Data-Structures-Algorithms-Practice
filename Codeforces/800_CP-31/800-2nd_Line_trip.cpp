#include<bits/stdc++.h>
using namespace std;
int main(){
int t;
cin>>t;
while(t--){
    int n,x;
    cin>>n>>x;

    vector<int> A(n);
    cin>>A[0];
    int maxdiff=A[0];
    int diff;
    for(int i=1;i<n;i++){
        cin>>A[i];
        diff=A[i]-A[i-1];
        maxdiff=max(maxdiff,diff);
    }
    int req=abs(A[n-1]-x);
    req=req*2;
    cout<<max(req,maxdiff)<<endl;

}
}

