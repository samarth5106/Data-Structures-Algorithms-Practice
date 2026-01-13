
class Solution {
  public:
    bool canServe(vector<int> &arr) {
        // code here
        int fiv=0;
       int ten=0;
        int twnt=0;
        for(int i=0;i<arr.size();i++){
            if(arr[i]==5)
            fiv++;
            else if(arr[i]==10){
                if(fiv>=1){
                    fiv--;
                    ten++;
                }
                else return false;
            }
            else{
                if(fiv>=1&&ten>=1){
                    fiv--;
                    ten--;
                    twnt++;
                    continue;
                }
                else if(fiv>=3&&ten==0)
                {
                    fiv-=3;
                    twnt++;
                    continue;
                }
                
                else return false;
            }
        }
        return true;
    }
};
