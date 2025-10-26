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
        int l=0,r=0;
        int maxlen=0;
        int len;
        int sum=0;
        for(int r=0;r<n;r++){
            sum+=A[r];
            if(sum>0){
                //r++;
                sum-=A[l];
                l++;
            }
            else if(sum==0){
                len=(r-l)+1;
                maxlen=max(maxlen,len);
                //r++;
            }
        }
        cout<<maxlen<<endl;

    }








}
