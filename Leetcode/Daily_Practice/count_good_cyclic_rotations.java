class Solution {
    public int countGoodRotations(int[] nums) {
        int cnt=0;
        int siz=nums.length/2;
        long sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        int l=0;
        int r=siz-1;
        long fhlf=0;
        
        for(int i=l;i<=r;i++){
            fhlf+=nums[i];
        }
        if(fhlf>sum-fhlf) cnt++;
        //r++;
        
        
        while(l<n-1){
            r++;
            if(r>=n)r=0;
            fhlf+=nums[r];
            fhlf-=nums[l];
            l++;
            //r++;
            if(fhlf>sum-fhlf) cnt++;
        }
        return cnt;
        
    }
}
