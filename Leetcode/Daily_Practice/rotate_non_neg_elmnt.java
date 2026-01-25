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
See what i was doing- rotating manually like for every value till we not 
reached k, I was rotating every single elmnt to its left ,, so outer 
loop - while(k-->0) and inner loop again inner loop for shiting elmnt to 
their left place ,,, so got TLE.
 Optimise- k=k%cnt,, to handel if the value of k is greater than cnt ,, 
 then we did not sihifted each elmnt to its left but we directly finded 
 the final position after that ith elmnt got shifted by k ,, by formula
rotation[i]=position[(i+k)%cnt]
cnt - number of positives, 
