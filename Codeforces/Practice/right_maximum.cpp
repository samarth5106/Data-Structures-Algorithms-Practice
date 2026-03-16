#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        vector<int> prfx(n);
        int maxi=-1;
        int idx;
        for(int i=0;i<n;i++){
            if(vec[i]>=maxi){
                maxi=vec[i];
                idx=i;
            }
            prfx[i]=idx;
        }
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            int val=prfx[i];
            cnt++;
            while(i>=0&&prfx[i]==val){
                i--;
            }
            i++;
        }
        cout<<cnt<<endl;
    }
    return 0;
}
