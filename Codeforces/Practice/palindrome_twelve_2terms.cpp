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
        bool found=false;
        int target_rem=n%12;
        for(int a=0;a<=22;a++){
            int rev=0,temp=a;
            while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
            }
            if(a==rev){
                if(a%12==target_rem&&n>=a){
                    long long b=n-a;
                    cout<<a<<" "<<b<<"\n";
                    found=true;
                    break;
                }
            }
        }
        if(!found){
            cout<<"-1\n";
        }
    }
    return 0;
}
