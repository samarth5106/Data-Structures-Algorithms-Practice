#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int w,p,k;
        cin>>w>>p>>k;
        int sum=0;
        if(w>=k){
            sum=k*2;
        }
        else if(w<k){
            sum=w*2+(k-w);
        }
        cout<<sum<<endl;
    }
}
