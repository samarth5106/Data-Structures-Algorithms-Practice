class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int maxi=0;
        int prev=0;
        for(int i=0;i<gain.size();i++){
            int alt_on_gain=prev+gain[i];
            maxi=max(alt_on_gain,maxi);
            prev=alt_on_gain;
        }
        return maxi;
    }
};
