class Solution {
    public int minimumCost(int[] nums) {
        int ans=nums[0];
    Arrays.sort(nums);
    if(nums[0]==ans){
ans+=nums[1]+nums[2];
    }
    else if(ans==nums[1]){
        ans+=nums[0]+nums[2];
    }
    else
    ans+=nums[0]+nums[1];
    
    return ans;
    }
}
