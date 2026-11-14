class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int a=0;
            int b=i-1;
            int sum=0;
            for(int j=0;j<=b;j++){
                sum+=nums.get(j);
            }
            if(sum>0)ans=Math.min(ans,sum);
            sum-=nums.get(a);
            a++;
            b++;
            
            while(b<nums.size()){
                sum+=nums.get(b);
                 if(sum>0)ans=Math.min(ans,sum);
                 sum-=nums.get(a);
            a++;
            b++;
           
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}
