#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int k;
        cin>>k;
        string s;
        cin>>s;
        int totalcnt=0;
        if(n==k){ cout<<"YES"<<endl; continue;}
        
        else{
           for(int i=0;i<n;i++){
               
               char c=s[i];
               int cnt=0;
               while(i<n&&s[i]==c){
                   cnt++;
                  i++;
                  
               }
               i--;
               if(cnt>=1){
                   totalcnt+=1;
                   
               }
               
           }
        }
        if(totalcnt<=k) cout<<"YES"<<endl;
        
        else cout<<"NO"<<endl;
        
    }

}
