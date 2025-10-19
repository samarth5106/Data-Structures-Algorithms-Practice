#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        unordered_map<int,int> unmp;
        for(int i=0;i<n;i++){
            cin>>A[i];
            unmp[A[i]]++;
        }
        sort(A.begin(),A.end());
        vector<int> b;

            int k=unmp[A[0]];
            while(k--){
                b.push_back(A[0]);
            }

        if(A.size()==b.size()){
            cout<<"-1"<<endl;continue;
        }
        vector<int> c;
       for(int i=unmp[A[0]];i<n;i++){
        c.push_back(A[i]);
       }
        cout<<b.size()<<" "<<c.size()<<endl;
        for(int i=0;i<b.size();i++){
            cout<<b[i]<<" ";
        }
        cout<<endl;
        for(int i=0;i<c.size();i++){
            cout<<c[i]<<" ";
        }
    }


}
