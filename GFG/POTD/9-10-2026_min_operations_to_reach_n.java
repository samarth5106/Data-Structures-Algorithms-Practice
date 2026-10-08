class Solution {
    
    int solve(int n){
        if(n==0) return 0;
        if((n&1)==0) return 1+solve(n/2);
        else return 1+solve(n-1);
    }
    
    public int minOperation(int n) {
        // code here
        
        // if n even double is best
        // if n odd then 
        
        int ans=0;
        
        ans=solve(n);
        return ans;
    }
}
