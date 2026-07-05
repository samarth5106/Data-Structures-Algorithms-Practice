class Solution {
    public int maxValidPairSum(int[] nums, int k) {
    //j=i+k se n tk jao
        int maxi=0;
        int maxlft=Integer.MIN_VALUE;
       
        for(int j=k;j<nums.length;j++){
            maxlft=Math.max(maxlft,nums[j-k]);
            maxi=Math.max(maxi,maxlft+nums[j]);
        }
        return maxi;
    }
}©leetcode
