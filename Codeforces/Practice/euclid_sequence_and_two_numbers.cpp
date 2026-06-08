#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        sort(vec.begin(),vec.end(),greater<int>());
        if(n==2){
            cout<<vec[0]<<" "<<vec[1]<<"\n";
            continue;
        }
        bool isit=true;
        for(int i=2;i<n;i++){
            if(vec[i-2]%vec[i-1]!=vec[i]){
                isit=false;
                break;
            }
        }
        if(isit){
            cout<<vec[0]<<" "<<vec[1]<<"\n";
        }else{
            cout<<"-1\n";
        }
    }
    return 0;
}
