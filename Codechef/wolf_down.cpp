#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    string s;
	    cin>>s;
	    int cnt=0;
	    for(int i=0;i<s.length();i++){
	        if(s[i]=='1'){
	            break;
	        }
	        else cnt++;
	    }
	    cout<<cnt<<endl;
	}

}
