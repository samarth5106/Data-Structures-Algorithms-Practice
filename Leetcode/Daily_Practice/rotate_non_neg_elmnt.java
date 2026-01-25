class Solution {
    public int[] rotateElements(int[] nums,int k){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)cnt++;
        }
        if(cnt==0){
            return nums;
        }

        int[] pos=new int[cnt];
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos[p]=nums[i];
                p++;
            }
        }

        k=k%cnt;
        int[] rot=new int[cnt];
        for(int i=0;i<cnt;i++){
            rot[i]=pos[(i+k)%cnt];
        }

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=rot[j];
                j++;
            }
        }
        return nums;
    }
}
