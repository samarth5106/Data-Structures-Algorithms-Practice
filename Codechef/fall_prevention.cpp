#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        for(int i=0;i<n;i++){
            cin>>A[i];
           
        }
        
        long long sum=0;
        int firstBad=-1;
         for (int i=0;i<n;i++) {
            sum+=A[i];

            if (sum<0) {
                firstBad=i;
                break;
            }
        }
        if (firstBad==-1) {
            cout<<"YES\n";
            continue;
        }
        if (firstBad==-1) {
            cout<<"YES\n";
            continue;
        }
        int deleteIndex=0;

        for (int i=1;i<=firstBad;i++) {
            if (A[i]<A[deleteIndex]) {
                deleteIndex=i;
            }
        }
         sum=0;
        bool possible=true;

        for (int i=0;i<n;i++) {

            if (i==deleteIndex)
                continue;

            sum+=A[i];

            if (sum<0) {
                possible=false;
                break;
            }
        }

        cout<<(possible?"YES\n":"NO\n");
        
    }

}
