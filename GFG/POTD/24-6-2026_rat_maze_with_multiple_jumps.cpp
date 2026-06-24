#include <vector>
using namespace std;

class Solution {
public:
    int solve(int i,int j,vector<vector<int>>& mat,vector<vector<int>>& ans,vector<vector<int>>&dp){
        // Fix 1: Correct base case destination check
        if(i==mat.size()-1&&j==mat[0].size()-1){
            ans[i][j]=1;
            return 1;
        }
        if(mat[i][j]==0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        ans[i][j]=1;
        int val=mat[i][j];
        
        for(int k=1;k<=val;k++){ 
            
            if(j+k<mat[0].size()){
                int right=solve(i,j+k,mat,ans,dp);
                if(right){
                    return dp[i][j]=1;
                }
            }
            
            if(i+k<mat.size()){
                int down=solve(i+k,j,mat,ans,dp);
                if(down) return dp[i][j]=1;
            }
        }
        
        ans[i][j]=0;
        return dp[i][j]=0;
    }

    vector<vector<int>> shortestDist(vector<vector<int>>& mat) {
        if(mat[0][0]==0) return {{-1}};
        vector<vector<int>> dp(mat.size(),vector<int>(mat[0].size(),-1));
        
        vector<vector<int>> ans(mat.size(),vector<int>(mat[0].size(),0));
        int verdict=solve(0,0,mat,ans,dp);
        
        if(verdict==0) return {{-1}};
        return ans;
    }
};
