#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n,l,r;
        cin>>n;
        cin>>l>>r;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
      //  int conse=r-l+1;
        int left=0;
        int right=0;
        for(int i=0;i<l-1;i++){
            left+=vec[i];
        }
        for(int i=r;i<n;i++){
            right+=vec[i];
        }
        cout<<max(left,right)<<endl;
        
        
    }

}
