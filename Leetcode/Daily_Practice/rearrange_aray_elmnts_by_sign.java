class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pos=-1;
        int neg=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0&&pos==-1){
                pos=i;
            }
            if(nums[i]<0&&neg==-1){
                neg=i;
            }
            if(pos!=-1&&neg!=-1){
                break;
            }
        }
        int i=0;
        boolean p=false;
        boolean n=false;
        while(i<nums.length){
            if(p==false){
                ans[i]=nums[pos];
            p=true;pos++;
            while(pos<nums.length&&nums[pos]<0){
                pos++;
            }
            i++;continue;
            }
            
                ans[i]=nums[neg];
                n=true;neg++;
                while(neg<nums.length&&nums[neg]>0){
                neg++;
                }
                if(p==true)
                p=false;
            
            i++;
        }
        return ans;
        
    }
}
