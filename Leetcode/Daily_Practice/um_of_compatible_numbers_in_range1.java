class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum=0;
        int l=Math.max(1,n-k);
        int r=n+k;
        for(int i=l;i<=r;i++){
            if((n&i)==0){
                sum+=i;
            }
        }
        return sum;
    }
}©leetcode
