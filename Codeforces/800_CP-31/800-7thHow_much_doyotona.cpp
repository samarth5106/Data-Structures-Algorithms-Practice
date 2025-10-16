#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, k;
        cin>>n>>k;
        vector<int> A(n);
int flag=0;
        for(int i=0;i<n;i++){
            cin>>A[i];
            if(A[i]==k){
                flag=1;
            }
        }

        if(flag==1){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
