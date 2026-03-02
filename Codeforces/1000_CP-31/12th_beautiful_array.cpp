#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        long long n,k,b,s;
        cin>>n>>k>>b>>s;

        long long minsum=b*k;
        long long maxsum=b*k+(n*(k-1));

        if(s<minsum||s>maxsum){
            cout<<-1<<endl;
            continue;
        }

        vector<long long> vec(n,0);
        vec[0]=b*k;
        long long rem=s-b*k;

        for(int i=0;i<n&&rem>0;i++){
            long long add=min(rem,k-1);
            vec[i]+=add;
            rem-=add;
        }

        for(int i=0;i<n;i++){
            cout<<vec[i]<<" ";
        }
        cout<<endl;
    }
}
