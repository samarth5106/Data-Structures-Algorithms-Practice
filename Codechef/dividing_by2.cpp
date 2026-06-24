#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        vector<int> arr=vec;
        //freq should be n
       // sort(vec.begin(),vec.end());
        unordered_map<int,int> mp;
        
        for(int i=0;i<vec.size();i++){
            while(vec[i]!=1){
                mp[vec[i]]++;
                vec[i]/=2;
            }
            mp[vec[i]]++;
        }
        int ans=0;
        for(const auto &pair:mp){
            if(pair.second==n){
                ans=max(ans,pair.first);
            }
        }
        //cout<<ans<<endl;
        int cnt=0;
        for(int n:arr){
            while(n!=ans){
                cnt++;
                n/=2;
            }
        }
        cout<<cnt<<endl;
        
        
        
    }

}
