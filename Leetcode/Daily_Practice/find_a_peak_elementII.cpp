class Solution {
public:
    vector<int> findPeakGrid(vector<vector<int>>& mat) {
        int l=0;
        int h=mat[0].size()-1;
        vector<int> ans;
        while(l<=h){
            int mid=(l+h)/2;
            int maxi=0;
            int ridx=0;
            for(int i=0;i<mat.size();i++){
                if(maxi<mat[i][mid]){
                    maxi=mat[i][mid];
                    ridx=i;
                }
            }
            int left=-1;
            if(mid-1>=0){
                left=mat[ridx][mid-1];
            }
            int right=-1;
            if(mid+1<mat[0].size()){
                right=mat[ridx][mid+1];
            }
            if(maxi>left&&maxi>right){
                ans.push_back(ridx);
                ans.push_back(mid);
                return ans;
            }
            else if(left>maxi){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return {-1,-1};
    }
};
