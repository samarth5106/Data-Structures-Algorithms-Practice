class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i==0)
            {
                ans=nums[i];cnt++;continue;
            }
            if(nums[i]==ans){
                cnt++;
            }
            else{
                cnt--;
                if(cnt==0){cnt++;
                    ans=nums[i];
                }
            }

        }
        return ans;
        
    }
}
