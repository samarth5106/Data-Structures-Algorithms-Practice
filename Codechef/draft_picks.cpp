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
        int maxi=0;
        while(k!=0){
            for(int i=0;i<n&&k!=0;i++){
                vec[i]+=k;
                maxi=max(maxi,vec[i]);
                k--;
            }
            if(k>0){
                for(int i=n-1;i>=0&&k!=0;i--){
                    vec[i]+=k;
                    maxi=max(maxi,vec[i]);
                    k--;
                }
            }
        }
    cout<<maxi<<endl;
        
        
    }

}
