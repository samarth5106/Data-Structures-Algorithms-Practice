#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        int cntminus=0, cntplus=0;

        for(int i=0; i<n; i++){
            cin>>A[i];
            if(A[i] == 1){
                cntplus++;
            }
            else{
                cntminus++;
            }
        }

        int opn = 0;

        // Jab tak ya to odd -1s hai ya -1s zyada hai, convert karte raho
        while(cntminus%2!=0 || cntminus>cntplus){
            opn++;
            cntminus--;
            cntplus++;
        }

        cout << opn << endl;
    }
    return 0;
}
