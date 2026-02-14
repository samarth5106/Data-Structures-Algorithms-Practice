class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] result=new int[nums.length];
        int k;
        int cnt;
        for(int i=0;i<nums.length;i++){
            k=i;
            if(nums[k]>0){
                 cnt=nums[k];
                while(cnt-->0){
                    if(k==nums.length-1){
                        k=0;continue;
                    }
                    k++;
                
                }
                result[i]=nums[k];
            }
            else if(nums[i]<0){
                cnt=Math.abs(nums[i]);
                k=i;
                while(cnt-->0){
                    if(k==0){
                        k=nums.length-1;
                        continue;
                    }
                    k--;
                }
                result[i]=nums[k];
            }
            else{
                result[i]=nums[i];
            }
        }
        return result;

    }
}
