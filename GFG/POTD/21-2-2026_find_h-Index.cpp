class Solution {
  public:
    int hIndex(vector<int>& citations) {
        // code here
        sort(citations.begin(),citations.end());
       // unordered_map<int,int> unmp;
       /* for(int i=0;i<citations.size();i++){
            if()
        }*/
        int n=citations.size();
        int maxval=-1;
        int possible=0;
        for(int i=0;i<citations.size();i++){
            if(n-i>=citations[i]){
                
                maxval=max(maxval,citations[i]);
            }
            else{
                //maxval=max(maxval,citations.size()-i);
                possible=max(possible,n-i);
            }
            
        }
        
        maxval=max(maxval,possible);
        return maxval;
    }
};
