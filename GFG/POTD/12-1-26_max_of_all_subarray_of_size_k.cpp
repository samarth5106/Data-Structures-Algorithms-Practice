class Solution {
public:
    vector<int> maxOfSubarrays(vector<int>& arr, int k) {

        int l = 0, r = k - 1;
        vector<int> ans;

        int maxi = arr[0];
        for (int i = l; i <= r; i++)
            maxi = max(maxi, arr[i]);

        ans.push_back(maxi);
        r++;

        while (r < arr.size()) {

            // if outgoing element was maximum
            if (arr[l] == maxi) {
                l++;
                maxi = arr[l];
                for (int i = l; i <= r; i++)
                    maxi = max(maxi, arr[i]);
            }
            else {
                l++;
                maxi = max(maxi, arr[r]);
            }

            ans.push_back(maxi);
            r++;
        }

        return ans;
    }
};
