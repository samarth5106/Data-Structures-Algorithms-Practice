class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long mini=Math.min(cost1+cost2,costBoth);
        long ans=0;
        if(need2==need1){
            ans=mini*need2;
        }
        else if(need1>need2){
            long rem1=need1-need2;
            ans=need2*mini;
            long incr1way1=cost1*rem1;
            long incr1way2=costBoth*rem1;

            ans+=Math.min(incr1way1,incr1way2);
        }
        else{
            long rem2=need2-need1;
            ans=need1*mini;
            long incr2way1=cost2*rem2;
            long incr2way2=rem2*costBoth;
            ans+=Math.min(incr2way1,incr2way2);
        }
        return ans;
    }
}
