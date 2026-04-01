#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
 
        int n,m;
        cin>>n>>m;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
        if(m>n){
            cout<<'0'<<endl;
            return 0;
        } 
        int l=1;
        int h=*max_element(vec.begin(),vec.end());
        int ans;
       // sort(vec.begin(),vec.end());
        while(l<=h){
            int mid=(l+h)/2;
            long long p=0;
            for(int i=0;i<n;i++){
                p+=vec[i]/mid;
            }
            if(p>=m){
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;
        }
        cout<<ans<<endl;
        
    

}
