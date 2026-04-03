class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        
        // always binary search on smaller array
        if(nums1.size() > nums2.size())
            return findMedianSortedArrays(nums2, nums1);

        int m = nums1.size();
        int n = nums2.size();

        int l = 0, h = m;

        while(l <= h){
            int cut1 = (l + h) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int l1 = (cut1 == 0) ? INT_MIN : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? INT_MIN : nums2[cut2 - 1];

            int r1 = (cut1 == m) ? INT_MAX : nums1[cut1];
            int r2 = (cut2 == n) ? INT_MAX : nums2[cut2];

            // correct partition
            if(l1 <= r2 && l2 <= r1){
                
                // odd length
                if((m + n) % 2 == 1){
                    return max(l1, l2);
                }
                // even length
                else{
                    return (max(l1, l2) + min(r1, r2)) / 2.0;
                }
            }
            else if(l1 > r2){
                h = cut1 - 1;
            }
            else{
                l = cut1 + 1;
            }
        }

        return 0.0;
    }
};
