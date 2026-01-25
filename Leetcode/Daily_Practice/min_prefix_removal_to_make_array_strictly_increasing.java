class Solution {
    public int minimumPrefixLength(int[] nums) {
        int idx=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]>=nums[i]){
                idx=i;break;
            }
        }
        return idx;
        
    }
}
