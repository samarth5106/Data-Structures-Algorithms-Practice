class Solution {
  public:
    vector<int> findClosestPair(vector<int> &arr1, vector<int> &arr2, int x) {
        // code here
        int i=0;
        int j=arr2.size()-1;
        vector<int> ans;
        int sum;
        int mini=INT_MAX;
        bool first=true;
        int diff;
        while(i<arr1.size()&&j>=0){
            sum=arr1[i]+arr2[j];
            diff=abs(x-sum);
            if(first){
                mini=diff;
                ans.push_back(arr1[i]);
                ans.push_back(arr2[j]);
                first=false;
            }
            if(diff<mini){
                ans.clear();
                ans.push_back(arr1[i]);
                ans.push_back(arr2[j]);
                mini=diff;    
            }
            if(sum>x){
                j--;
            }
            else{
                i++;
            }
            
            /*if(diff>mini){
                if(sum>x){
                    j--;
                }
                else{
                    i++;
                }
            }
            */
        }
       return ans;
    }
};
