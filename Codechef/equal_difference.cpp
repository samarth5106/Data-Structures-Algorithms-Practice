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
        long long cnt=0;
       unordered_map<long long , long long> mp;
       for(int i=0;i<n;i++){
           mp[vec[i]-i]++;
       }
       for(auto it:mp){
           long long f=it.second;
           cnt+=(f*(f-1))/2;
       }
        cout<<cnt<<endl;
        
    }

}
