
#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;

    while(t--){
        int n;
        cin>>n;

        vector<int> vec(n);

        for(int i=0;i<n;i++){
            cin>>vec[i];
        }

        int i=0,j=n-1;

        while(i<j && vec[i]==vec[j]){
            i++;
            j--;
        }

        if(i>=j){
            cout<<"NO"<<endl;
            continue;
        }

        int x=-1;

        for(int k=1;k<=n;k++){
            if(k!=vec[i] && k!=vec[j]){
                x=k;
                break;
            }
        }

        if(x==-1){
            cout<<"NO"<<endl;
        }
        else{
            cout<<"YES "<<x<<endl;
        }
    }

    return 0;
}
