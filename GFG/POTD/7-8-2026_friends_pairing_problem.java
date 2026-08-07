class Solution {
    
    int solve(int n){
       // if(n<=0) return 0;
       if(n==0||n==1) return 1; 
        int single=solve(n-1);
        int paired=(n-1)*solve(n-2);
        return single+paired;
        
    }
    
  public:
  
    int countFriendsPairings(int n) {
        // code here
        // 1 to <=n
        return solve(n);
    }
    
};
