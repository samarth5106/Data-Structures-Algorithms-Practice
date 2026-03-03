class Solution {
  public:
    int totalElements(vector<int> &arr) {
        // code here
        unordered_map<int,int> mp;
        int l=0,r=0;
        int distnt=0;
        int maxi=0;
        while(r<arr.size()){
            if(mp[arr[r]]==0){
                distnt++;
                
            }
            mp[arr[r]]++;
           
            if(distnt>2){
                while(distnt>2){
                   
                        mp[arr[l]]--;
                    if(mp[arr[l]]==0)
                    distnt--;
                    l++;
                }
            }
             if(distnt<=2){
                maxi=max(maxi,r-l+1);
            }
            
            r++;
        }
        return maxi;
    }
};
