class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int hr) {
        // 1 ya 2 ya 3 ya 4 ya 5 ya ......
        // min 1 
        // max max(piles);
        // mid depend on poora khtm kitn eme kr rh OR khtm krne me kitna time le rh
        int l=1;
        int val=-1;
        for(int i=0;i<piles.size();i++){
            val=max(val,piles[i]);
        }
        int h=val;
        int ans=val;
        while(l<=h){
            int mid=(l+h)/2;
            long long ttl=0;
            for(int i=0;i<piles.size();i++){
                ttl+=(piles[i]+mid-1)/mid;
            }

            if(ttl<=hr){
                ans=mid;
                h=mid-1;
            }

            else
            l=mid+1;
            
        }
        return ans;
    }
};
