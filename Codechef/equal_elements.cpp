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
        map<int,int> mp;
        int cnt=0;
        for(int i=0;i<n;i++){
            mp[vec[i]]++;
            if(mp[vec[i]]==2){
                cnt+=2;
                mp.clear();
            }
        }
        cout<<cnt<<endl;
        
    }

}
