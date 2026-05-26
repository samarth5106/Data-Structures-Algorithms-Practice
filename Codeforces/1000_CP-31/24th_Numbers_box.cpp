#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n,m;
	    int negs=0;
	    cin>>n>>m;
	    int smallest=INT_MAX;
	    vector<vector<int>> mat(n,vector<int>(m));
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            cin>>mat[i][j];
	            if(mat[i][j]<0) {
	                negs++;
	            }
	            smallest=min(smallest,abs(mat[i][j]));
	        }
	    }
	    int total=0;
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            total+=abs(mat[i][j]);
	        }
	    }
	    if(negs%2!=0){
	        total-=2*abs(smallest);
	    }
	    cout<<total<<endl;
	    
	}

}
