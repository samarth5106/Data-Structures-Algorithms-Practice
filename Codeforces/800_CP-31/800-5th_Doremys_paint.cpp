#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> A(n);
        unordered_map<int,int> freq;

        for(int i=0;i<n;i++){
            cin>>A[i];
            freq[A[i]]++;
        }
        if(freq.size()==1){
            cout<<"yes"<<endl;
            continue;
        }
        else if(freq.size()==2){
            vector<int> counts;
            for(const auto& a:freq){
                counts.push_back(a.second);
            }
            if(counts[0] == counts[1] && n%2==0){
                cout<<"yes"<<endl;
            }
            else if(abs(counts[0]-counts[1])==1 && n%2!=0){
                cout<<"yes"<<endl;
            }
            else{
                cout<<"no"<<endl;
            }
        }
        else{
            cout<<"no"<<endl;
        }
    }
    return 0;
}
