#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int k;
        cin>>k;
        vector<int> a(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        sort(a.begin(),a.end());
        vector<int> diff;
        int cnt=0;
        for(int i=1;i<n;i++){
            //cin>>a[i];
            diff.push_back(a[i]-a[i-1]);

        }
        int total=n;
        int max_len=0;
        int l=0;
        for(int r=0;r<n-1;r++){
            if(diff[r]<=k){
                max_len=max(max_len,r-l+1);
            }
            else {
                if(r!=n-2){
                    l=r+1;
                }

            }
        }
        cout<<total-(max_len+1)<<endl;




    }













}
