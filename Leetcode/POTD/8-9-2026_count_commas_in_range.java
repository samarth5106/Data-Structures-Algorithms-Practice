class Solution {
    public int countCommas(int n) {
       // int cnt=0;
        if(n<1000) return 0;

        int val=1000;
        //10000- 5 digit
        int num=n-val;
        return (num+1);

    }
}
