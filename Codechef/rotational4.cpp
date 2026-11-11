#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string s;
        cin>>s;
        int cnt=0;
       // if(stoi(s)%4==0) cnt++;
    //   if(n==1){
    //         if(stoi(s)%4==0) cnt++;
    //         cout<<cnt<<endl;
    //         continue;
    //   }
        for(int i=0;i<s.length();i++){
            int tens=s[i]-'0';
            int units=s[(i+1)%n]-'0';
            int num=tens*10+units;
            if(num%4==0) cnt++;
        }
        
        cout<<cnt<<endl;
    }

}
