#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string s;
        cin>>s;
        stack<char> st;
        for(char c:s){
            if(st.empty())
            st.push(c);
            else if(st.top()=='('&&c==')') {
             st.pop();
            }
            else st.push(c);
        }
        cout<<st.size()/2<<endl;
        
    }

}
