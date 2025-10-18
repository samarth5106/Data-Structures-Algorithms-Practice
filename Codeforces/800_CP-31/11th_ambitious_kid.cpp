#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;

    vector<int> A(n);
    int diff;
    int mini=INT_MAX;
    for(int i=0;i<n;i++){
        cin>>A[i];
        diff=abs(A[i]-0);
        mini=min(diff,mini);
    }
    cout<<mini<<endl;






}
