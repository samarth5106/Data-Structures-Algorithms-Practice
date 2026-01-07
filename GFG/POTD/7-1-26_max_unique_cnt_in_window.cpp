class Solution {
public:
    vector<int> countDistinct(vector<int> &arr, int k) {

        int l = 0, r = k - 1;
        int cnt = 0;
        int n = arr.size();

        int maxi = *max_element(arr.begin(), arr.end());
        vector<int> check(maxi + 1, 0);   // frequency array

        vector<int> ans;

        // first window
        for (int i = l; i <= r; i++) {
            if (check[arr[i]] == 0)
                cnt++;
            check[arr[i]]++;
        }
        ans.push_back(cnt);

        r++;

        // sliding window
        while (r < n) {

            // remove left element
            check[arr[l]]--;
            if (check[arr[l]] == 0)
                cnt--;
            l++;

            // add right element
            if (check[arr[r]] == 0)
                cnt++;
            check[arr[r]]++;

            ans.push_back(cnt);
            r++;
        }

        return ans;
    }
};
