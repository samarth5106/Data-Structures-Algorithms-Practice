#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n+1);
        int sum=0;
        for(int i=0;i<=n;i++){
        vec[i]=i;
            if(i%2==0)
            sum+=i;
           
        }
        cout<<sum<<endl;
        
        
        
    }

}
