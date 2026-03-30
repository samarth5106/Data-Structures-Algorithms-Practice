class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        vector<int> vec;
        int i=0;
        int val=1;
        int flg=0;

            while(i<arr.size()){
                 while(i<arr.size()&&arr[i]!=val){
                vec.push_back(val);
                val++;
                if(vec.size()==k){
                    flg=1;break;
                } 
            }
            if(flg==1) break;
            val++;
            i++;
            }
           
           
        
        if(flg==0){
            val=arr[arr.size()-1];
            val++;
            while(vec.size()!=k){
                vec.push_back(val);
                val++;
            }
        }
        return vec[vec.size()-1];

    }
};
