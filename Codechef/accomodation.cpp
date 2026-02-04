#include<iostream>
#include<algorithm>
using namespace std;
int main(){
int t;if(!(cin>>t))return 0;
while(t--){
long long b,g,x,y,n;cin>>b>>g>>x>>y>>n;
if(x+y>n){cout<<-1<<endl;continue;}
long long qwer1=(b+g+n-1)/n;
long long qwer2=0;
if(x>0)qwer2=max(qwer2,b/x);
if(y>0)qwer2=max(qwer2,g/y);
if(b<qwer1*x||g<qwer1*y){cout<<-1<<endl;}
else{cout<<qwer1<<endl;}
}return 0;}
