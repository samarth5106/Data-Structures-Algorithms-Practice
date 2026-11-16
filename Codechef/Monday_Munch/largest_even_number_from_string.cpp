#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    string s;
    cin>>s;
    
    string ans="";
    
    //evenlargest
    
    int mini=INT_MAX;
    vector<int> vec;
    
    for(char x:s){
        if(isdigit(x)){
            int digit=x-'0';
            if(digit<mini&&(digit%2)==0){
                mini=digit;
            }
            vec.push_back(digit);
        }
    }
    if(mini==INT_MAX){
        cout<<"-1"<<endl;
        return 0;
        
    }
    //smalest even - end position and baki sorted greater<>
    auto it=find(vec.begin(),vec.end(),mini);
    
    if(it!=vec.end()) vec.erase(it);
    
    
    
    
    sort(vec.begin(),vec.end(),greater<int>());
    ans="";
    for(int i=0;i<vec.size();i++){
        ans+=(char)(vec[i]+'0');
    }
    
    ans+=(char)(mini+'0');
    
    
    if((ans[0])=='0') cout<<"0"<<endl;
    
    else cout<<ans<<endl;
    
    return 0;
    

}
