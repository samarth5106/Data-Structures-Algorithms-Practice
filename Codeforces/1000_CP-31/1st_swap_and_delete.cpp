#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        string s;
        cin>>s;
        int one=0,zro=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='1')
            one++;
            else
            zro++;
        }
        int cost=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='1'){
                
                if(zro==0){
                    cost+=s.length()-i;
                    break;
                   // continue;
                }
                zro--;
            }
            else{
                if(one==0){
                    cost+=s.length()-i;
                    break;
                  //  continue;
                }
                one--;
            }
        }
        cout<<cost<<endl;
        
        
    }

}
