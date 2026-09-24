class Solution {

    boolean check(int val,int idx){
        String s=val+"";
        int sum=0;

        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
        return sum==idx;

    }

    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(check(nums[i],i)) return i;
        }
        return -1;
    }
}
