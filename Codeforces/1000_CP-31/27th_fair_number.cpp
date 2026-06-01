#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        long long n;
        cin>>n;
        while(true){
            string s=to_string(n);
            bool is_valid=true;
            for(char c:s){
                int digit=c-'0';
                if(digit==0) continue;
                if(n%digit!=0){
                    is_valid=false;
                    break;
                }
            }
            if(is_valid){
                cout<<n<<"\n";
                break;
            }
            n++;
        }
    }
    return 0;
}
