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

Approach-  see main thing was to choose those residents jo kam paise me jyada kaam kr ke de skate the out main concern was Minimum Cost so hamne ek new vector bnaya named "net" uska har ek element was a pair , pair ki first term was the price , and its second term was the number of people it could reach atmost so based of the price hamne sort kar dia ,, and then important thing was ki jo resident ka b[i] was more than p unko to bhul hi jaao as the chief Pak Chunek is himself taking only price - P so we cant pay higher price to other to do the same work for higher price ,,, and  also there is issue of Integer flow so we used "long long" datatype for cost and use "1LL" while multiplication
