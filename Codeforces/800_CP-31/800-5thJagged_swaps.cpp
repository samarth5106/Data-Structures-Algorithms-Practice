#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        for(int i=0;i<n;i++){
            cin>>A[i];
        }
        for(int j=0;j<n*n;j++){
            for(int i=1;i<n-1;i++){
                if(A[i]>A[i+1]&&A[i]>A[i-1]){
                    swap(A[i],A[i+1]);
                }
            }
        }
        int st=1;
        for(int i=0;i<n-1;i++){
            if(A[i]<A[i+1]){
                continue;
            }
            else{
                st=0;
                cout<<"NO"<<endl;
                break;
            }
        }
        if(st!=0){
            cout<<"YES"<<endl;
        }
    }
}
