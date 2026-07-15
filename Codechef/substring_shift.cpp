#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        string s;
        cin>>s;
        int start=-1;
        int end=-1;
        for(int i=0;i<n;i++) {
            if(s[i]=='z') {
                start=i;
                end=i;
                for(int j=i+1;j<n;j++) {
                    if(s[j]=='z') {
                        end=j;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        if(start!=-1&&end!=-1) {
            for(int i=start;i<=end;i++) {
                s[i]='a';
            }
        }
        cout<<s<<"\n";
    }
    return 0;
}
