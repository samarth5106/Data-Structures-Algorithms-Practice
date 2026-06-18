class Solution {
public:
  
    bool checkValidString(string s) {
        vector<vector<int>> dp(s.length()+1,vector<int>(s.length()+1));
        dp[s.length()][0]=true;

        for(int i=s.length()-1;i>=0;i--){
            for(int open=s.length()-1;open>=0;open--){
                if(s[i]==')'){
                    if(open>0)
                    dp[i][open]=dp[i+1][open-1];
                    else
                    dp[i][open]=false;
                }
                else if(s[i]=='('){
                    dp[i][open]=dp[i+1][open+1];
                
                }
                else{
                    dp[i][open]=dp[i+1][open]||dp[i+1][open+1];
                    if(open>0){
                        dp[i][open]=dp[i][open]||dp[i+1][open-1];
                    }
                }
            }
        }
        
        return dp[0][0];

    }
};
