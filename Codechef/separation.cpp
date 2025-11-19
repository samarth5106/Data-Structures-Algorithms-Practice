#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while(t--){
        int n, x;
        cin >> n >> x;
        
       int le=0,grt=0,eql=0;
        vector<int> A(n);
        for(int i = 0; i < n; i++){
           cin>>A[i];
           if(A[i]==x) eql++;
           else if(A[i]>x){
               grt++;
           }
           else{
               le++;
           }
        }
        if(eql > 0 || le == 0 || grt== 0){
            cout << "YES" << endl;
        }
        else{
            cout << "NO" << endl;
        }
    }
    return 0;
}
