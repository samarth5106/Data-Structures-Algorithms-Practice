#include <bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    string s;
	    cin>>s;
	    unordered_map<char,int> lowrmp;
	    
	    for(int i=0;i<n;i++){
	        char c=tolower(s[i]);
	        lowrmp[c]++;
	    }
	    
	    int maxFreq=0;
	    int secondMaxFreq=0;
	    
	    for(auto p:lowrmp){
	        if(p.second>maxFreq){
	            secondMaxFreq=maxFreq;
	            maxFreq=p.second;
	        }
	        else if(p.second>secondMaxFreq){
	            secondMaxFreq=p.second;
	        }
	    }
	    
	    int result=maxFreq+secondMaxFreq;
	    
	    cout<<result<<endl;
	}
}
