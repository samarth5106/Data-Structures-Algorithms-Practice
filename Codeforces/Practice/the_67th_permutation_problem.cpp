#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    
    while(t--){
        int n;
        cin>>n;

        int strt=1;
        int end=3*n;

        vector<int> ans;

        for(int i=0;i<n;i++){
            ans.push_back(strt++);
            ans.push_back(end-1);
            ans.push_back(end);
            end-=2;
        }

        for(int x:ans) cout<<x<<" ";
        cout<<endl;
    }
}
