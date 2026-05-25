int n=s.length();
    if(s[n-1]=='1') return false;
    
    vector<bool> dp(n,false);
    dp[0]=true;
    int prefixSum=0;
    
    for(int i=1;i<n;i++){
        // Add new position to range
        if(i>=minJump){
            if(dp[i-minJump]) prefixSum++;
        }
        
        // Remove old position from range
        if(i>maxJump){
            if(dp[i-maxJump-1]) prefixSum--;
        }
        
        // Check if reachable
        if(s[i]=='0' && prefixSum>0){
            dp[i]=true;
        }
    }
    
    return dp[n-1];
