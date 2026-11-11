#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        
        priority_queue<int> pq;
        long long sum=0;
        long long mn=0;
        for(int i=1;i<=n;i++){
            int x;
            cin>>x;
            sum+=x;
            pq.push(x);
            if(pq.size()>i/2)pq.pop();
            
        }
        while(!pq.empty()){
            mn+=pq.top();
            pq.pop();
            
        }
        cout<<sum-2*mn<<endl;
        
    }

}
