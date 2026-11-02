class Solution {
    public int minMoves2(int[] nums) {
       // int moves=0;
        //median tak le aate hai
        Arrays.sort(nums);
        int n=nums.length;
        int mid=(n-1)/2;
        int finaal=nums[mid];
        if(((n-1)&1)==1){
            //odd 
            int num1=(n-1)/2;
            int num2=n/2;
             finaal=(nums[num1]+nums[num2])/2;

        }
        int diff=0;
        for(int i=0;i<nums.length;i++){
            diff+=Math.abs(nums[i]-finaal);
        }
        return diff;
    }
}
