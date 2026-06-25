class Solution {
    int solve(long n,int cnt){
        if(n==1) return cnt;
       int add=0;
        int sub=0;
        if((1&n)==0){
             while((1&n)==0){
                n/=2;
                cnt++;
             }
             
        if(n==1) return cnt;
        }
            add=solve(n+1,cnt+1);
            sub=solve(n-1,cnt+1);
        
        return Math.min(add,sub);

    }
    public int integerReplacement(int n) {
        int cnt=0;
       return solve(n,cnt);
 
    }
}
