#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        int evn=0,odd=0;
        for(int i=0;i<n;i++){
            cin>>A[i];
            if(A[i]%2==0){
                evn++;
            }
            else{
                odd++;
            }
        }
        if(odd%2==0){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"No"<<endl;
        }


    }





}
