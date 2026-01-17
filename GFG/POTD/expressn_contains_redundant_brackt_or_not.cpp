bool checkRedundancy(string &s){
    stack<char> st;
    for(int i=0;i<s.size();i++){
        if(s[i]==')'){
            bool ok=false;
            while(!st.empty()&&st.top()!='('){
                char c=st.top();
                st.pop();
                if(c=='+'||c=='-'||c=='*'||c=='/')ok=true;
            }
            st.pop();
            if(!ok)return true;
        }
        else{
            st.push(s[i]);
        }
    }
    return false;
}
