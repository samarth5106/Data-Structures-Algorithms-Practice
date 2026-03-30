class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        int l=*max_element(weights.begin(),weights.end());
        long long h=0;
        for(int i=0;i<weights.size();i++){
            h+=weights[i];
        }
        int ans;
        while(l<=h)
        {
            long long mid=(l+h)/2;
            int sum=0;
            int d=days;
            int i=0;
            while(i<weights.size()&&d!=0){
                d--;
                sum=0;
                int j=i;
               while(j < weights.size() && sum + weights[j] <= mid){
                 sum += weights[j];
                 j++;
                }
                i=j;
            }
            if(i==weights.size()){
                h=mid-1;
                ans=mid;
            } 
            else{
                l=mid+1;
            }
        }
            
    return ans;
        
    }
};
