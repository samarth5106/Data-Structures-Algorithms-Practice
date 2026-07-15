#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
    
    for(int i=0;i<n;i++) {
        cin>>arr[i];
    }
    
   // int =0;
    
    int ahead=0;
    int prev=arr[0];
    int curr;
    for(int i=1;i<n;i++) {
        // prev=arr[i];
         curr=arr[i];
        if((prev%2==0&&curr%2==0)||(prev%2==1&&curr%2==1)){
            curr=curr+1;
            prev=curr;
            ahead++;
        }
        else{
            prev=curr;
        }
        // if(i!=n-1&&arr[i]%2==0&&arr[i+1]%2==0){
            
        // }
    }
    int current=0;
    for(int i=0;i<n-1;i++){
        if((arr[i]%2==0&&arr[i+1]%2==0)||(arr[i]%2==1&&arr[i+1]%2==1)){
            arr[i]=arr[i]+1;
            current++;
        }
    }
    cout<<min(ahead,current)<<"\n";
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while(t--) {
        solve();
    }
    return 0;
}
