class Solution {
public:
   bool solve(int i,int open,string &s,vector<vector<int>> &dp){
    if(open<0) return false;

    if(i==s.size()){
        return open==0;
    }
    if(dp[i][open]!=-1) return dp[i][open];
    if(s[i]=='('){
        return dp[i][open]=solve(i+1,open+1,s,dp);
    }

    if(s[i]==')'){
        return dp[i][open]=solve(i+1,open-1,s,dp);
    }

    return dp[i][open]=solve(i+1,open,s,dp)||
           solve(i+1,open+1,s,dp)||
           solve(i+1,open-1,s,dp);
}

    bool checkValidString(string s) {
        vector<vector<int>> dp(s.length()+1,vector<int>(s.length()+1,-1));
        bool ans=solve(0,0,s,dp);
        return ans;
    }
};
