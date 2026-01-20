import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
        
            if(i==nums.length-1&&ans==Integer.MAX_VALUE){
                    ans=nums[i];
                    break;
            }
           
            if(nums[i]==nums[i+1]){
                i++;
            }
            else
            ans=nums[i];
        }
        return ans;
    }
  
}
