
class Solution {
  public:
    int sumSubMins(vector<int> &arr) {
        int n=arr.size();
        long long total=0;
        stack<int> st;
        
        for(int i=0;i<=n;i++){
            while(!st.empty()&&(i==n||arr[st.top()]>arr[i])){
                int idx=st.top();
                st.pop();
                
                int left=idx;
                if(!st.empty()){
                    left=idx-st.top();
                }
                else{
                    left=idx+1;
                }
                
                int right=i-idx;
                
                total+=(long long)arr[idx]*left*right;
            }
            
            if(i<n){
                st.push(i);
            }
        }
        
        return total;
    }
};
