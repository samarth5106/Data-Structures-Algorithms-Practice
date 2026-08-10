class Solution {
    boolean isperfect(int n){
        int root=(int)Math.sqrt(n);
        return root*root==n;
    }

    boolean solve(int person,int n,Boolean[][] dp){
    //   if(isperfect(n)){
    //     if(person==1) return true;
    //     return false;
    //   } 
        if(n==0) return false;
        if(dp[person][n]!=null) return dp[person][n];
        int val=1;

        while(val*val<=n){
            if(!solve(person==1?0:1,n-(val*val),dp)) return dp[person][n]=true;
            val++;
        }

        return dp[person][n]=false;
    }

    public boolean winnerSquareGame(int n) {
        //
        //if n already perfect sq then return true
        //if not hmare paas choices h 1,4,9,16,25 etc ki ky choose krna chahie
        // aliceke lie best socho 
       // n=50
       
        //sabhi ways me if kabhi bhi alice ke upr ek perfect sq number nhi aya then false
        Boolean[][] dp=new Boolean[2][n+1];
        return solve(1,n,dp);

    }
}
