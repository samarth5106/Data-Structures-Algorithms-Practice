class Solution {
public:
    double minimiseMaxDistance(vector<int> &arr, int k) {
        
        int n = arr.size();
        
        double l = 0;
        double h = 0;
        
        // find max gap
        for(int i = 1; i < n; i++){
            h = max(h, (double)(arr[i] - arr[i-1]));
        }
        
        double eps = 1e-6;
        
        while(h - l > eps){
            double mid = (l + h) / 2.0;
            
            int cnt = 0; // stations needed
            
            for(int i = 1; i < n; i++){
                double gap = arr[i] - arr[i-1];
                
                if(gap > mid){
                    cnt += (int)(gap / mid);  // approx
                    if((int)(gap / mid) * mid == gap) cnt--; // exact case
                }
            }
            
            if(cnt <= k){
                h = mid;
            } else {
                l = mid;
            }
        }
        
        return h;
    }
};
