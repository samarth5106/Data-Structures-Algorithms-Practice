#include<bits/stdc++.h>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    //numebr of subarray - [prefix sum and hashmap]
    int n,x;
    cin>>n>>x;
    int k=x;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    //sum =sum[r];
    //sum[r]-sum[l-1]=k
    //sum[l-1]=sum[r]-k
    int cnt=0;
    
    unordered_map<int,int> unmp;
    unmp[0]++;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=a[i];
       // unmp[sum]++;
        if(unmp.find(sum-k)!=unmp.end()){
            cnt+=unmp[sum-k];
        }
        unmp[sum]++;
    }
    cout<<cnt<<endl;
    return 0;
}
