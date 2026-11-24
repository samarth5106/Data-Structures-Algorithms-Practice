class Solution {
    private long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
           a =temp;
        }
        return a;
    }
    public int maxLength(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i++){
            long prod=nums[i];
            long lcm=nums[i];
            long gcd=nums[i];
            for(int j=i+1;j<nums.length;j++){
                prod*=nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=(lcm*nums[j])/gcd(lcm,nums[j]);
                if(prod==gcd*lcm){
                    len=Math.max(len,j-i+1);

                }
                else if(prod>gcd*lcm) break;
            }
        }
        return len;
    }
}
