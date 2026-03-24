class Solution {
  public:
    bool canFinish(int n, vector<vector<int>>& prerequisites) {
        // Code here
        vector<int> vec(n);
        for(int i=0;i<prerequisites.size();i++){
            int val=prerequisites[i][1];
            vec[val]=1;
        }
        for(int i=0;i<n;i++){
            if(vec[i]==0){
                return true;
            }
        }
        return false;
    }
};
