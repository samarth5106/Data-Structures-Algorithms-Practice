#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int k;
        cin>>k;
        
        vector<int> vec(n);
        for(int i=0;i<n;i++){
            cin>>vec[i];
           
        }
        
        string s;
        cin>>s;
        vector<int> ans;
        for(int i=0;i<n;i++){
            if(s[i]=='0'){
                ans.push_back(vec[i]);
            }
        }
        int cnt1=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='1')
            cnt1++;
        }
                int sum=0;
        if(cnt1==n||s.length()-cnt1<k){
        cout<<"-1"<<endl;
        continue;}

        else{
            sort(ans.begin(),ans.end());
            int j=0;
            while(k--){
                sum+=ans[j];
                j++;
            }
            
        }
        cout<<sum<<endl;
        
    }

}
