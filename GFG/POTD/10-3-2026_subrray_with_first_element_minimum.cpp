class Solution {
  public:
    int countSubarrays(vector<int> &arr) {
        int n=arr.size();
        vector<int>next(n,n);
        stack<int>st;
        
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&arr[st.top()]>=arr[i]){
                st.pop();
            }
            if(!st.empty()){
                next[i]=st.top();
            }
            st.push(i);
        }
        
        long long cnt=0;
        for(int i=0;i<n;i++){
            cnt+=next[i]-i;
        }
        
        return cnt;
    }
};
