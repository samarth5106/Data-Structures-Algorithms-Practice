class Solution {
public:
    vector<int> findUnion(vector<int>& a, vector<int>& b) {
        // code here
        a.insert(a.end(), b.begin(), b.end());
        sort(a.begin(), a.end());
        
        vector<int> ans;
        int i;
        for (i = 0; i < a.size() - 1; i++) {
            if (a[i] != a[i + 1]) {
                ans.push_back(a[i]);
            }
        }
        ans.push_back(a[i]);
        return ans;
    }
};
