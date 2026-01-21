#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n,m;
	    cin>>n>>m;
	    vector<int> A(n);
	    vector<int> B(m);
	    for(int i=0;i<n;i++){
	        cin>>A[i];
	    }
	     for(int i=0;i<m;i++){
	        cin>>B[i];
	    }
	    //ifrst>>>>>samller
	    int k=0;
	    int cnt=0;
	    //sort(A.begin(),A.end());
	    //sort(B.begin(),B.end());
	   for(int i=0;i<n;i++){
	       for(int j=0;j<m;j++){
	           if(A[i]>B[j])
	           cnt++;
	       }
	   }
	    cout<<cnt<<endl;
	    
	    
	}

}
