#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<vector<long long>> vec(n,vector<long long>(2,0));
        for(int i=0;i<n;i++){
            cin>>vec[i][0];
            vec[i][1]=i;
           
        }
        vector<int> ans(n);        
        sort(vec.begin(),vec.end());
        
        vector<long long> prfxsm(n);
        long long s=0;
        int k=0;
        for(vector<long long> val:vec){
         s+=val[0];
         prfxsm[k]=s;
         k++;
        }
        int cnt=0;

        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                ans[vec[i][1]] = n - 1;
            }
            else{
                if(prfxsm[i] >= vec[i+1][0]){
                    ans[vec[i][1]] = ans[vec[i+1][1]];
                }
                else{
                    ans[vec[i][1]] = i;
                }
            }
        }
        for(int i=0;i<n;i++){
            cout<<ans[i]<<" ";
        }
        cout<<endl;
        
        
    }

}
