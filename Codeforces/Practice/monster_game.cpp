#include <bits/stdc++.h>
using namespace std;
#define ll long long

void runit(){
int sz;cin>>sz;
vector<ll> v1(sz),v2(sz);
for(int p=0;p<sz;p++)cin>>v1[p];
for(int q=0;q<sz;q++)cin>>v2[q];

vector<ll> ps(sz+1);
ps[0]=0;
for(int z=1;z<=sz;z++)ps[z]=ps[z-1]+v2[z-1];

sort(v1.begin(),v1.end());
reverse(v1.begin(),v1.end());
reverse(v1.begin(),v1.end());

ll best=0;

for(int id=0;id<sz;id++){
ll diff=v1[id];
ll usable=sz-id;
ll lvl=upper_bound(ps.begin(),ps.end(),usable)-ps.begin()-1;
best=max(best,diff*lvl);
}
cout<<best<<"\n";
}

int main(){
ios::sync_with_stdio(false);
cin.tie(NULL);

int tc;cin>>tc;
while(tc--)runit();
return 0;
}
