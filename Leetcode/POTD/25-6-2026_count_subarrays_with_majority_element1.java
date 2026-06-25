class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
     int cnt=0;
     int ans=0;
     for(int i=0;i<nums.length;i++){
        int len=0;
        cnt=0;
        if(nums[i]==target){
            cnt++;
            ans++;
        } 
        len++;
        for(int j=i+1;j<nums.length;j++){
            //total==len
            len++;
            if(nums[j]==target) cnt++;
            if(cnt>(len-cnt))
            ans++;
            
        }
     }
     return ans;   
    }
}
