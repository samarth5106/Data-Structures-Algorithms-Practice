#include <bits/stdc++.h>
using namespace std;

int main() {
    // Fast I/O (Codeforces me iske bina TLE ya output mismatch ho jata hai)
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<long> b(n);
        unordered_map<long,int> mp;
        bool hasDuplicate=false;
        
        for(int i=0;i<n;i++){
            cin>>b[i];
            mp[b[i]]++;
            if(mp[b[i]]>1){
                hasDuplicate=true;
            }
        }
        
        // Faisla loop ke BAALHAR hoga, takki print sirf ek baar ho har test case ke liye
        if(hasDuplicate){
            cout<<"YES\n";
        } else {
            cout<<"NO\n";
        }
    }
    return 0;
}
