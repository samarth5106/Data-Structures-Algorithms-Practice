class Solution {

    int togsum(int n){
        String s=n+"";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        return sum;
    }

    public int minElement(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            mini=Math.min(mini,togsum(nums[i]));
        }
        return mini;
        
    }
}
