class Solution {
    public boolean threeFibonacciSum(int n) {
        int f1=0;
        int f2=1;
        int f3=f1+f2;
        int sum=f1+f2+f3;
        while(sum<=n){
            if(sum==n) return true;
                sum-=f1;
            sum+=f2+f3;
            int prev=f3;
            f3=f3+f2;
            f1=f2;
            f2=prev;
            
        }
        return false;
    }
}©leetcode
