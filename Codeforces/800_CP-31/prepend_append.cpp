#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--)
    {

        int n;
        cin>>n;
        string s;
        cin>>s;
        int cnt=n;
        int i=0,j=n-1;
        while(i<j){
            if(s[i]!=s[j]){
                i++;j--;
            cnt=cnt-2;
            }
            else{
                break;
            }

        }
        cout<<cnt<<endl;
    }





}
