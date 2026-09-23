#include <bits/stdc++.h>
using namespace std;
bool possible(vector<int> a,long long x,int p,int q){
    int n=a.size();
    int k=0;
    while(k<n&&a[k]<x){
        k++;
    }
    if(k==n) return false;
    if(k>p) return false;
    int t=q+1;
    while(t<n&&a[t]<x){
        t++;
    }
    long long surplus=0;
    for(int i=k;i<t;i++){
        surplus+=a[i]-x;
        if(surplus<0) return false;
    }
    return true;
}
int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        for(int i=0;i<n;i++){
            cin>>A[i];
           
        }
        int p=-1;
        int q=-1;
        for(int i=0;i<n-1;i++){
            if(A[i]>A[i+1]){
                if(p==-1) p=i;
                 
                 q=i;
            }
        }
        if(p==-1){
            cout<<"-1"<<endl;
            continue;
        }
        long long lo=1;
        long long hi=*std::max_element(A.begin(), A.end());
        long long ans=1;
        while(lo<=hi){
            long long mid=lo+(hi-lo)/2;
            if(possible(A,mid,p,q)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        cout<<ans<<endl;
        
        
    }

}
