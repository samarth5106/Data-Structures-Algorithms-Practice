class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        
        int expected = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            while(expected < nums[i]){
                ans.add(expected);
                expected++;
            }
            expected = nums[i] + 1;  // Next expected
        }
        
        return ans;
    
    }
}
