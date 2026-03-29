class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        // m bouquets
        // k adjacent flower hona hi chahiye
        //min days to wait
        //min day to wait =l
        // max day to wait=max of array;
        if(bloomDay.size()<m*1LL*k) return -1;
        int l=1;
        int val=0;
        for(int i=0;i<bloomDay.size();i++){
            val=max(val,bloomDay[i]);
        }
        int h=val;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            int cnt=0;
            // 'mid'  number of day pr wait krne pr kitne phul bloom hue and kitne bouquet bn skte h
            for(int i=0;i<bloomDay.size();i++){
                int fl=0;
                while(i<bloomDay.size()&&mid>=bloomDay[i]){
                    fl++;
                    if(fl==k){
                        cnt++;
                        fl=0;
                    }
                    i++;
                }
            }
            if(cnt>=m){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;

        }
        return ans;


    }
};
