#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        long long c;
        cin>>c;
        vector<int> s(n);
        for(int i=0;i<n;i++){
            cin>>s[i];
        }
        long long l=1;
long long h=1e9;
long long ans=1;
while(l<=h){
    long long mid=l+(h-l)/2;
    long long merac=0;
    bool overflow=false;
    for(int i=0;i<n;i++){
        long long side=s[i]+2*mid;
        // Strict division check to prevent multiplication overflow
        if(c/side<side){
            overflow=true;
            break;
        }
        merac+=side*side;
        if(merac>c){
            overflow=true;
            break;
        }
    }
    if(overflow){
        h=mid-1;
    }
    else if(merac==c){
        ans=mid;
        break;
    }
    else{
        l=mid+1;
    }
}
cout<<ans<<"\n";
        
    }

}
