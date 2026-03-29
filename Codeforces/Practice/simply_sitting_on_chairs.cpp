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
        unordered_map<int,int> unmp;
        for(int i=0;i<n;i++){
            cin>>vec[i];
            unmp[vec[i]]=0;
           
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(vec[i]<=i+1)cnt++;
            
            
        }
        cout<<cnt<<endl;
        
        
        
    }

}
