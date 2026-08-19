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
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            cin>>vec[i];
            if(vec[i]&1==1) odd++;
            else even++;
           
        }
        if(odd==even){
            cout<<odd+even<<endl;
        }
        else{
            cout<<(min(odd,even)*2)+1<<endl;
        }
        
        
        
        
    }

}
