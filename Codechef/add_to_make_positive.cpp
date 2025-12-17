#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    vector<int> vec(n);
	    int sum=0;
	    int mini=INT_MAX;
	    for(int i=0;i<n;i++){
	        cin>>vec[i];
	        sum+=vec[i];
	        mini=min(mini,vec[i]);
	    }
	    for(int i=0;i<=abs(mini);i++){
	        if(sum+(i*n)>=0){
	            cout<<i<<endl;break;
	        }
	    }
	    
	    
	}

}
