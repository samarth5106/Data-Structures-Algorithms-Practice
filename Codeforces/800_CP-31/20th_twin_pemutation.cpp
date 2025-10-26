#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int aim=n+1;
        vector<int> ans;
        while(n--){
            int a;
            cin>>a;
            ans.push_back(aim-a);
        }
        for(int i=0;i<ans.size();i++){
            cout<<ans[i]<<" ";
        }
        cout<<endl;
    }

}
