#include <bits/stdc++.h>
using namespace std;

int solve(int i,std::vector<int>&v,int r,int g,int b)
{
    if(v[3]==0)
    return 0;
    
    if(v[i]==0)
    i++;
    
    int red=INT_MAX,green=INT_MAX,blue=INT_MAX;
    if(r!=0)
    {
        int temp=v[i];
        v[i]=max(0,v[i]-r);
        red=solve(i,v,max(0,r-temp),g,b);
        v[i]=temp;
    }
    if(g!=0)
    {
        int temp=v[i];
        v[i]=max(0,v[i]-g);
        green=solve(i,v,r,max(0,g-temp),b);
        v[i]=temp;
    }
    if(b!=0)
    {
        int temp=v[i];
        v[i]=max(0,v[i]-b);
        blue=solve(i,v,r,g,max(0,b-temp));
        v[i]=temp;
    }
    
    return 1+min({red,green,blue});
}
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--)
    {
        int l,w,r,g,b;
        cin>>l>>w>>r>>g>>b;
        std::vector<int>v(4) ;
        v[0]=l;
        v[1]=l;
        v[2]=w;
        v[3]=w;
        cout<<solve(0,v,r,g,b)<<endl;
    }
}
