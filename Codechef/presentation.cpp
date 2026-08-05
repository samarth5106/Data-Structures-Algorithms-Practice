#include <bits/stdc++.h>
using namespace std;

int main() {
	
  
        int n;
        cin>>n;
        if(n*30==600) cout<<"0"<<endl;
        else if((n*30)<600){
            int req=600-(n*30);
            req=req/30;
            cout<<req<<endl;
        }
        
        
    

}
