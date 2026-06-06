class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];

        }
        int val=0;
        int prfx=0;
        for(int i=0;i<nums.length;i++){
            
            val=Math.abs(s-nums[i]);
            s=val;
            ans[i]=Math.abs(val-prfx);
            prfx+=nums[i];
        }
        return ans;
        
    }
}
