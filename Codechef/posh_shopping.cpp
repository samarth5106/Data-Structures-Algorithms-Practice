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
        int sum=0;
        for(int i=n-1;i>=0;i--){
            int el=vec[i];
            sum=max(el,sum);
            for(int j=i-1;j>=0;j--){
                if(vec[j]<=el){
                    sum=max(sum,el+vec[j]);
                }
            }
        }
        cout<<sum<<endl;
        
        
        
    }

}
