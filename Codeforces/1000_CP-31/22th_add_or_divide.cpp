#include <bits/stdc++.h>
using namespace std;


int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
      long long a,b;
      cin>>a>>b;
     if(b>a){
         cout<<"1"<<endl;continue;
     }
      // no. of raw operations, if(b<a) b-a+2
      // but to be logical, 
     //int ans=a-b+2;
     int k=0;
     int cnt=0;
     int ans=INT_MAX;
     int kyh=b;
     int preva=a;
     if(b!=1){
          while(a!=0){
             cnt++;
             a=a/b;
         }
         ans=min(ans,cnt);
     }
    
    
     while(k<ans){
         k++;
         cnt=k;
         b=kyh+k;
         a=preva;
         while(a!=0){
             cnt++;
             a=a/b;
         }
         ans=min(ans,cnt);
         
     }
     
     cout<<ans<<endl;
     
     
      
    }

}
