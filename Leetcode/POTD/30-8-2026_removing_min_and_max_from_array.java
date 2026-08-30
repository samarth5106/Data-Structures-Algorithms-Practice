class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi=nums[0];
        int maxidx=0;
        int mini=nums[0];
        int minidx=0;
        for(int i=0;i<nums.length;i++){
            if(maxi<nums[i]){
                maxi=nums[i];
                maxidx=i;
            }
            if(mini>nums[i]){
                mini=nums[i];
                minidx=i;
            }
        }
       // int dist;
        int cover=Math.max(minidx,maxidx)+1;
        int rightcover=nums.length-Math.min(minidx,maxidx);
        int seperate=Math.min(minidx,maxidx)+1;
        int seperate2=nums.length-Math.max(minidx,maxidx);
        return Math.min(seperate2+seperate,Math.min(cover,rightcover));

    }
}
