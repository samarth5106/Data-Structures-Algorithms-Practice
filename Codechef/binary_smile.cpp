
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string a,b;
        cin>>a>>b;
        vector<int> posA,posB;
        for(int i=0;i<n;i++){
            if(a[i]=='1')posA.push_back(i);
            if(b[i]=='1')posB.push_back(i);
        }
        if(posA.size()!=posB.size()){
            cout<<-1<<endl;
        }else{
            int ops=0;
            for(int i=0;i<posA.size();i++){
                if(posA[i]!=posB[i])ops++;
            }
            cout<<ops<<endl;
        }
    }
    return 0;
}
