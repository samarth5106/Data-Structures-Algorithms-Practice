#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
        }
        if(n<2){
            cout<<"-1"<<endl;
            continue;
        }
        bool hoga=true;
        vector<int> ans;
        for(int i=0;i<n;i++){
            int val=vec[i];
            int j=i;
            while(j<n&&vec[j]==val){
                j++;
            }
            if(j-i==1){
                hoga=false;break;
            }
            ans.push_back(j);
            j--;
            while(i<j){
                ans.push_back(i+1);
                i++;
            }
            i=j;
        }
        if(hoga)
        {
            for(int h=0;h<n;h++){
                cout<<ans[h]<<" ";
            }
            cout<<endl;
        }
        else{
    
        cout<<"-1"<<endl;
        }
    }

}
