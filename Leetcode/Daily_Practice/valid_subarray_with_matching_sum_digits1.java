class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        long sum=0;
        int cnt=0;
        int l=0;
        int r=0;
       
         for(int i=0;i<nums.length;i++){
             sum=nums[i];
             String val=sum+"";
             if(sum%10==x&&val.charAt(0)-'0'==x) cnt++;
             for(int j=i+1;j<nums.length;j++){
                 sum+=nums[j];
                 String val2=sum+"";
             if(sum%10==x&&val2.charAt(0)-'0'==x) cnt++;
                 
             }
         }
        return cnt;
    }
}
