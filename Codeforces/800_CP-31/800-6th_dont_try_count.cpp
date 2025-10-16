#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n,m;
        cin>>n>>m;
        string x,s;
        cin>>x>>s;
        int cnt=0;
        bool found =false;
        while(cnt<=6&&!found){
            int len=x.length();
            for(int i=0;i<=len-m;i++){
                if(x.substr(i,m)==s){
                    found=true;break;
                }
            }
            if(!found){
                x += x;cnt++;
            }
        }

        if(found)
            cout<<cnt<<endl;

        else{
            cout<<-1<<endl;
        }
    }
    return 0;
}
