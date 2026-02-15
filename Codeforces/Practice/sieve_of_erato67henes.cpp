
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
    int s7=0;
    int one=0;
    
        for(int i=0;i<n;i++){
            cin>>vec[i];
            if(vec[i]==1)
            one=1;
            if(vec[i]==67)
            s7=1;
        }
        if(s7==1){
            cout<<"Yes"<<endl;
        }
        else
        cout<<"No"<<endl;
        
    }
 
}
