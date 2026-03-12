class Solution {
  public:
    int kBitFlips(vector<int>& arr, int k) {
        int n=arr.size();
        int cnt=0;
        int flip=0;
        vector<int> isFlipped(n,0);
        
        for(int i=0;i<n;i++){
            if(i>=k&&isFlipped[i-k]==1){
                flip--;
            }
            
            int current=arr[i];
            if(flip%2==1){
                current=1-current;
            }
            
            if(current==0){
                if(i+k>n){
                    return -1;
                }
                
                isFlipped[i]=1;
                flip++;
                cnt++;
            }
        }
        
        return cnt;
    }
};
