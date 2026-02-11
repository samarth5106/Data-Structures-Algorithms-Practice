#include<iostream>
#include<vector>
#include<cmath>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    long long tc;
    cin>>tc;

    while(tc--){
        long long sz;
        cin>>sz;

        vector<long long> vec(sz);
        for(long long i=0;i<sz;i++){
            cin>>vec[i];
        }

        bool allsame=true;
        for(long long i=1;i<sz;i++){
            if(vec[i]!=vec[0]){
                allsame=false;
                break;
            }
        }

        if(allsame){
            cout<<"Yes\n";
            continue;
        }

        long long base=llabs(vec[0]);
        bool ok=true;

        for(long long i=0;i<sz;i++){
            if(llabs(vec[i])!=base){
                ok=false;
                break;
            }
        }

        if(!ok){
            cout<<"No\n";
            continue;
        }

        int flipcnt=0;
        for(long long i=1;i<sz;i++){
            bool prevpos=vec[i-1]>0;
            bool curpos=vec[i]>0;
            if(prevpos!=curpos){
                flipcnt++;
            }
        }

        if(flipcnt<2) cout<<"Yes\n";
        else cout<<"No\n";
    }

    return 0;
}
