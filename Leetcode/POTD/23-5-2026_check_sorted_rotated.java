class Solution {

    public boolean check(int[] nums) {
        if(nums.length==1) return true;
       // boolean val=true;
       int cnt=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                cnt++;
            }
        }
       if(nums[0]<nums[nums.length-1]) cnt++;
       
       if(cnt>=2) return false;
       return true;
    }
}
