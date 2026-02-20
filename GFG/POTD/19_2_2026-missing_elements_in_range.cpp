class Solution {
  public:
    vector<int> missinRange(vector<int>& arr, int low, int high) {
        // code here
        sort(arr.begin(),arr.end());
        vector<int> ans;
        int val=low;
        bool done=false;
        bool hai=false;
        for(int i=0;i<arr.size();i++){
            if(arr[i]==high){
                hai=true;
            }
            if(arr[i]>high)
            break;
            
            if(arr[i]<val)
            continue;
            
            else if(arr[i]==val){
                val++;
                if(val>high){
                    done=true;break;
                }
                
            }
            if(arr[i]>val){
s;
    }
};





                while(val<high&&arr[i]>val){
                    ans.push_back(val);
                    val++;
                }
              // val++;
               if(val>high)
               {
                   done=true;
                   break;
               }
               else if(arr[i]<val)
               continue;
               else{
                   val++;
               }
            }
            
        }
        if(!hai){
            while(val<=high){
                ans.push_back(val);
                val++;
            }
        }
        return ans;
    }
};
