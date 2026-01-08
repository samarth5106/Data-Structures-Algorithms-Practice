#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    
    while(t--){
        int n;
        cin >> n;
        string s;
        cin >> s;
        unordered_map<char, int> freq;
        for(char ch : s){
            freq[ch]++;
        }
        
        bool possible = false;
        for(auto& p : freq){
            if(p.second >= 2){
                possible = true;
                break;
            }
        }
        
        if(possible){
            cout << "YES" << endl;
        }
        else{
            cout << "NO" << endl;
        }
    }
    
    return 0;
}
