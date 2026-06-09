#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        long long x;
        cin>>x;
        vector<int> a(n),b(n),c(n);
        for(int i=0;i<n;i++){//stack 1
            cin>>a[i];
        }
        for(int i=0;i<n;i++){//stack 2
            cin>>b[i];
        }
        for(int i=0;i<n;i++){//stack 3
            cin>>c[i];
        }
        if(x==0){ cout<<"YES"<<endl;continue;}
        // int lastbit;
        // if(x%2==0){
        //     lastbit= 0;// even
        // }
        // else{
        //      lastbit=1;//odd
        // }
        // if x is even (last bit 0) then each book be even
        // if x is odd (last bit 1) then each book be atleast one be odd 
        // even|even = last is 0
        // odd|odd   = last is 1
        // int i=n-1;
        string s="NO";
        int ai=0,bi=0,ci=0;
        int ans=0;
        while(ans!=x){
            if(ai<n&&(long long)((ans|a[ai])|x)==x){
                ans=ans|a[ai];
                ai++;
            }
            else if(bi<n&&(long long)((ans|b[bi])|x)==x){
                ans=ans|b[bi];
                bi++;
            }
            else if(ci<n&&(long long)((ans|c[ci])|x)==x){
                ans=ans|c[ci];
                ci++;
            }
            else{
                break;
            }
        }
        if(ans==x)
        cout<<"YES"<<endl;
        else
        cout<<s<<endl;
        
    }

}
