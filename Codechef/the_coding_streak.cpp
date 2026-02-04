#include <bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    vector<int> A(n);
	    for(int i=0;i<n;i++){
	        cin>>A[i];
	    }
	    int len=0;
	    int maxi=0;
	    for(int i=0;i<n;i++){
	        if(A[i]>=1){
	            len++;
	        }
	        else{
	            maxi=max(maxi,len);
	            len=0;
	        }
	    }
	    maxi=max(maxi,len);
	    cout<<maxi<<endl;
	}
}
