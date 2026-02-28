#include<bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    long n,k;
    cin>>n>>k;
    long x1,a,b,c;
    cin>>x1>>a>>b>>c;
    vector<long> orignal;
    orignal.push_back(x1);
    long prev=x1;
    long xr=0;
    for(long i=1;i<n;i++){
        long val=(a*(prev)+b)%c;
        orignal.push_back(val);
        prev=val;
        
    }
    long l=0,r=k-1;
    long sum=0;
    for(long i=0;i<=r;i++){
        sum+=orignal[i];
    }
    xr=xr^sum;
    r++;
    while(r<n){
        sum-=orignal[l];
        l++;
        sum+=orignal[r];
        r++;
        xr=xr^sum;
    }
    cout<<xr<<endl;
    
    return 0;
}
