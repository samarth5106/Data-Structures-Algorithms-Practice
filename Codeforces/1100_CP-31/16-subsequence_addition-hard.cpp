#include <bits/stdc++.h>
using namespace std;



int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> c(n);
        for(int i=0;i<n;i++){
            cin>>c[i];
        }
        
       sort(c.begin(),c.end()); 
       if(c[0]!=1){
           cout<<"NO"<<endl; continue;
       }
      bool status=true;
        
       long long total=1;
       
       for(int i=1;i<n;i++){
           
           long long target=c[i];
          
           if(target>total){
              
               status=false;
               break;
               
           }
           
           total+=target;
       }
       
       if(!status){
           cout<<"NO"<<endl;
           
       }
       else{
           cout<<"YES"<<endl;
       }
        
        
        
    }

}
