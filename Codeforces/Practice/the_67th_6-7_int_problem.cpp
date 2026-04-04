#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n=7;
        
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
        sort(vec.begin(),vec.end());
        int sum=0;
        for(int i=0;i<7;i++){
            if(i<6){
                sum+=(-1)*vec[i];
            }
            else{
                sum+=vec[i];
            }
        }
        cout<<sum<<endl;
        
        
    }

}
