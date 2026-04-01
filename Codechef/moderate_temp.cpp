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
        sort(vec.begin(),vec.end());
        int cnt=0;
        for(int i:vec){
            if(i==vec[0]||i==vec[n-1]){
                continue;
            }
            cnt++;
        }
        cout<<cnt<<endl;
        
        
    }

}
