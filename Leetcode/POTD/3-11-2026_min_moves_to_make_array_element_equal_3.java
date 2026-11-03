class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        int maxi=0;
        for(int v:nums){
            maxi=Math.max(maxi,v);
        }
        for(int v:nums){
            ans+=maxi-v;
        }
        return ans;
    }
}
