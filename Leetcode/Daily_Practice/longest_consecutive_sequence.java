import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=l+1;
        int len;
        int maxi=1;
        if (nums.length==0) return 0;

        boolean dupl=false;
        while(r<nums.length){
            if(nums[r-1]==nums[r]){
               l++;
                r++;continue;
            }
            if(nums[r-1]+1==nums[r]){
              //  dupl=true;
                len=r-l+1;
                maxi=Math.max(maxi,len);
               
            }
            else{
                l=r;
            }
            r++;
        }
        return maxi;
        
    }
}
