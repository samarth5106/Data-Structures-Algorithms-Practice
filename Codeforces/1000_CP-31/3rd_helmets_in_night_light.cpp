#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int p;
        cin>>p;
        vector<int> a(n);
        vector<int>b(n);
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        for(int i=0;i<n;i++){
            cin>>b[i];
        }
        vector<pair<int, int>> net(n);
        
        for(int i = 0; i < n; i++){
        net[i] = {b[i], a[i]}; 
        }
        
        sort(net.begin(),net.end());
        long long cost=0;
       
        cost+=p;
        int remaining=n-1;
        int now=0;
        while(remaining!=0&&now<n){
            int barr=net[now].second;
            if(net[now].first>=p){
                cost+=1LL*remaining*p;break;
            }
            while(remaining!=0&&barr!=0){
            cost+=net[now].first;
            remaining--;
            barr--;
            }
            now++;
         
        }
        cout<<cost<<endl;
    }

}
