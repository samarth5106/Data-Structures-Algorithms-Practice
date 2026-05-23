class Solution {
    public int minimumSwaps(int[] nums) {
        int last=nums.length-1;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=last;j>i;j--){
                    if(nums[j]!=0){
                        int temp=nums[j];
                        nums[j]=0;
                        nums[i]=temp;
                        cnt++;
                        last=j-1;
                        break;
                    }
                }
            }
        }
        return cnt;
        
    }
}©leetcode
