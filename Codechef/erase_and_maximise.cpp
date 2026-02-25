#include <iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
       int n,s;
        cin>>n>>s;
      int ess=0;
        if(s>5*n){
            ess=s-5*n;
        }else{
            ess=0;
        }
        int answer=(n-ess)*6+ess*5;
        cout<<answer<<endl;
    }
    return 0;
}
