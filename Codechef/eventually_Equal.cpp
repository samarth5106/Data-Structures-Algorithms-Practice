#include<bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--) {
        long long a,b,c;
        cin>>a>>b>>c;
        if(a==b) {
            cout<<0<<"\n";
            continue;
        }
        if(gcd(a,c)==gcd(b,c)){
            cout<<"1"<<endl;continue;
        }
        else{
            c++;
            if(gcd(a,c)==gcd(b,c)){
            cout<<"2"<<endl;continue;
        }
        }
        cout<<"3"<<endl;
        
    }
    return 0;
}
