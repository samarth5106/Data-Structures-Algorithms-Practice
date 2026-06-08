class Solution {
    public int[] pivotArray(int[] nums,int pi) {

        int[] ans=new int[nums.length];
        int i=0;
        int f=nums.length-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]<pi){
                ans[i]=nums[k];
                i++;
            }
            if(nums[nums.length-1-k]>pi){
                ans[f]=nums[nums.length-1-k];
                f--;
            }
        }
        while(i<=f){
            ans[i]=pi;
            i++;
        }
        return ans;
    }
}
