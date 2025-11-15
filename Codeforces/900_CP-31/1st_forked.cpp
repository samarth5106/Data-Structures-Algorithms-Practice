#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int a,b;
        cin>>a>>b;
        int xk,yk;
        cin>>xk>>yk;
        int xq, yq;
        cin>>xq>>yq;
        set<pair<int,int>> attackingKing;
        set<pair<int,int>> attackingQueen;
        vector<int> dx={a,a,-a,-a,b,b,-b,-b};
        vector<int> dy={b,-b,b,-b,a,-a,a,-a};
        for(int i=0;i<8;i++){
            int sumx=xk+dx[i];
            int sumy=yk+dy[i];
            attackingKing.insert({sumx,sumy});
        }

        for(int i=0;i<8;i++){
            int sumx=xq+dx[i];
            int sumy=yq+dy[i];
            attackingQueen.insert({sumx,sumy});
        }

        int cnt=0;
        for(auto pos : attackingQueen){
            if(attackingKing.find(pos) != attackingKing.end()){
                cnt++;
            }
        }

        cout<<cnt<<endl;
    }
    return 0;
}
