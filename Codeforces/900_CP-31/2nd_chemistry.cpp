#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n, k;
        cin>>n>>k;
        string s;
        cin>>s;

        int remain = n - k;
        unordered_map<char,int> unmp;
        for(int i=0;i<n;i++){
            unmp[s[i]]++;
        }
        int odd_freq = 0;
        for(auto& p : unmp){
            if(p.second % 2 != 0){
                odd_freq++;
            }
        }

        if(remain % 2 == 0){
            if(k >= odd_freq && (k - odd_freq) % 2 == 0){
                cout<<"YES"<<endl;
            }
            else{
                cout<<"NO"<<endl;
            }
        }
        else{
            if(k >= odd_freq - 1 && (k - (odd_freq - 1)) % 2 == 0){
                cout<<"YES"<<endl;
            }
            else{
                cout<<"NO"<<endl;
            }
        }
    }
    return 0;
}
