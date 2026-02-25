// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin>>t;
    while(t--){
        long long n;
        cin>>n;
       int g=1;
       for(int i=2;i*i<=n;i++){
           if(n%i==0){
               g=n/i;
               break;
           }
       }
       cout<<g<<" "<<n-g<<endl;
    }

    return 0;
}
