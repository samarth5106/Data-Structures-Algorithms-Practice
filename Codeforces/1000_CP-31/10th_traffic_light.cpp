#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        char c;
        cin>>c;
        string s;
        cin>>s;

        int ans=0;
       
        vector<int> green;
        s=s+s;
        if(c=='g'){
        cout<<ans<<endl;continue;}
        for(int i=0;i<s.length();i++){
         if(s[i]=='g'){
             green.push_back(i);
         }   
    }
    
        for(int i=0;i<n;i++){  
    if(s[i]==c){
        int l=0,h=green.size()-1;
        int best=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(green[mid]>i){
                best=green[mid];
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(best!=-1){
            ans=max(ans,best-i);
        }
    }
}
        cout<<ans<<endl;
        
    }

}
