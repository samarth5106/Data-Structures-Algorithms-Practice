#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--) {
        int n,p;
        cin>>n>>p;
        string s;
        cin>>s;
        int to_left=0;
        for(int i=0;i<p;i++) {
            if(s[i]=='R') {
                to_left++;
            }
        }
        int to_right=0;
        for(int i=p-1;i<n;i++) {
            if(s[i]=='L') {
                to_right++;
            }
        }
        cout<<min(to_left,to_right)<<"\n";
    }
    return 0;
}
