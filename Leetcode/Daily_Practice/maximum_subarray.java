class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int maxi=nums[0];
        int i=1;
        if(sum<0) sum=0;
        while(i<nums.length){
            sum+=nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0) sum=0;
            i++;
        }
        return maxi;
    }
}
