#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    string s;
    cin>>s;
    
    stack<char> st;
    int i=0;
    while(i<s.length()){
        if(s[i]!='#') st.push(s[i]);
        else{
            if(st.size()!=0) st.pop();
        }
        i++;
    }
    int j=0;
    string sb="";
    while(st.size()!=0){
        sb=sb+st.top();
        st.pop();
    }
    reverse(sb.begin(),sb.end());
    cout<<sb<<endl;

}
