class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int i=nums.length-1;
        long ans=0;
        while(i>=0&&k-->0){
            long val=nums[i];
            ans+=Math.max(val,val*mul);
            mul--;
            i--;
        }
        return ans;
    }
}©leetcode
