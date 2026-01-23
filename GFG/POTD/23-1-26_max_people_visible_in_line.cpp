class Solution {
  public:
    int maxPeople(vector<int> &arr) {
        // code here
        int mx = *max_element(arr.begin(), arr.end());
        int size=arr.size();
        int cnt=1;
        int ans=0;
        int seen=0;
        int previdx=-1;
        for(int i=0;i<arr.size();i++){
             if(arr[i]==mx){
                 if(previdx==-1)
                 previdx=i;
                      seen++;
             }
     
          if(seen==2){
              seen=1;
              ans=max(cnt,ans);
              cnt=i-previdx;
              previdx=i;
              
              continue;
          }
          if(arr[i]!=mx){
              cnt++;
          }
         
        }
        ans=max(ans,cnt);
        return ans;
        
        
    }
};
