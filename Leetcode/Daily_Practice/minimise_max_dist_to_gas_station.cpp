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


Approach : We are given gas station positions aur hume k new stations add karne hain
aise ki maximum distance between adjacent stations minimum ho jaye.

Direct placement karna difficult hai, isliye hum binary search on answer use karte hain,
jisme hum distance (mid) ko guess karte hain.

Har guess ke liye hum check karte hain ki kya sab gaps ko ≤ mid banaya ja sakta hai
using at most k stations.

Har consecutive pair ke liye gap nikalte hain
aur dekhte hain us gap ko mid se chhote parts me todne ke liye kitne stations chahiye,
jo approx `gap / mid` se milta hai
(exact divisible case me 1 kam karna padta hai).

Sab gaps ke required stations ko add karte hain,
aur agar total ≤ k hai to mid possible hai,
to hum aur chhota try karte hain,
warna mid badhate hain.

Kyuki answer decimal me hota hai,
hum binary search tab tak chalate hain
jab tak high aur low ka difference 1e-6 se kam na ho jaye,
jo required precision ensure karta hai.

