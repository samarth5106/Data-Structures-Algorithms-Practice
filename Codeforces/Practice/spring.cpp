#include <bits/stdc++.h>
using namespace std;
 
long long lcm(long long x,long long y){
    if(x==0||y==0) return 0;
    return (x/__gcd(x,y))*y;
}
 
int main(){
    int t;
    cin>>t;
    while(t--){
        long long a,b,c,m;
        cin>>a>>b>>c>>m;
 
        long long lab=lcm(a,b);
        long long lbc=lcm(b,c);
        long long lac=lcm(a,c);
        long long labc=lcm(lab,c);
 
        long long allsath=m/labc;
        long long absath=(m/lab)-allsath;
        long long bcsath=(m/lbc)-allsath;
        long long acsath=(m/lac)-allsath;
 
        long long onlya=(m/a)-(absath+acsath+allsath);
        long long onlyb=(m/b)-(absath+bcsath+allsath);
        long long onlyc=(m/c)-(acsath+bcsath+allsath);
 
        long long alice=onlya*6+absath*3+acsath*3+allsath*2;
        long long bob=onlyb*6+absath*3+bcsath*3+allsath*2;
        long long carl=onlyc*6+acsath*3+bcsath*3+allsath*2;
 
        cout<<alice<<" "<<bob<<" "<<carl<<endl;
    }
    return 0;
}
