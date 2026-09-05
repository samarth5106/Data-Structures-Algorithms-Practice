class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxi=new int[nums.length];
        maxi[0]=nums[0];
        int[] mini=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            maxi[i]=Math.max(maxi[i-1],nums[i]);
            //mini[i]=
        }
        mini[nums.length-1]=nums[nums.length-1];
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            mini[i]=Math.min(mini[i+1],nums[i]);
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            int inst=maxi[i]-mini[i];
            if(inst<=k){
                ans=i;break;
            }
        }
        return ans;
    }
}
