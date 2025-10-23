#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        cin>>A[0];
        int flg=0;
        for(int i=1;i<n;i++){
            cin>>A[i];
            if(A[i-1]>A[i]){flg=1;
                //cout<<"0"<<endl;
            }

            }
            if(flg==1){
                cout<<"0"<<endl;
                continue;
            }
            int idx;
            int mini=INT_MAX;
            int diff;
            for(int i=0;i<n-1;i++){
                diff=A[i+1]-A[i];
                if(mini>diff){
                    idx=i;
                    mini=diff;
                }
            }
            cout<<(mini/2)+1<<endl;
    }
    system("pause");
    return 0;
}
