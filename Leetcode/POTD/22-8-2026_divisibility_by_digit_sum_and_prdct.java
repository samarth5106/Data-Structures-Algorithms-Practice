class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int val=n;
        int prdct=1;
        while(val>0){
            int digit=val%10;
            val=val/10;
            prdct*=digit;
            sum+=digit;
        }

        if(n%(sum+prdct)==0) return true;
        return false;
    }
}
