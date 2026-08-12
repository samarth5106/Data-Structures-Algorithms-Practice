class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
       int l=0;
       int r=0;
       int maxi=0;
       while(r<nums.length){
        int elmnt=nums[r];
       mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
int freq = mp.get(nums[r]);
        if(freq>k){
           // maxi=Math.max(maxi,r-l);
            while(l<=r&&freq>k){
                int val=nums[l];
               mp.put(nums[l], mp.get(nums[l]) - 1);
                if(nums[l]==elmnt) freq=mp.get(val);
                l++;
            }
        }
        maxi=Math.max(maxi,r-l+1);
        r++;
       }
       return maxi;
    }
}
