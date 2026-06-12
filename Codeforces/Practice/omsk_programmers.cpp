#include<bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        long long a,b,x;
        cin>>a>>b>>x;
        if(a==b){
            cout<<0<<"\n";
            continue;
        }
        if(x==1){
            cout<<abs(a-b)<<"\n";
            continue;
        }
        vector<vector<long long>> amap;
        int cnta=0;
        while(a!=0){
            amap.push_back({a,cnta});
            a=a/x;
            cnta++;
        }
        amap.push_back({a,cnta});
        vector<vector<long long>> bmap;
        int cntb=0;
        while(b!=0){
            bmap.push_back({b,cntb});
            b=b/x;
            cntb++;
        }
        bmap.push_back({b,cntb});
        long long ans=-1;
        for(int p=0;p<amap.size();p++){
            for(int q=0;q<bmap.size();q++){
                long long req=amap[p][1]+bmap[q][1]+abs(amap[p][0]-bmap[q][0]);
                if(ans==-1||req<ans){
                    ans=req;
                }
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
