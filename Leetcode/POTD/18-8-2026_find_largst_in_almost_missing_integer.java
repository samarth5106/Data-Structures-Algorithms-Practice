class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] hash=new int[51];
        int l=0;
        int r=k-1;
        int maxi=0;

        while(r<nums.length){
            int occured[]=new int[51];

            for(int i=l;i<=r;i++){

                if(occured[nums[i]]==0){
                    hash[nums[i]]++;
                    occured[nums[i]]=1;
                }
                
                 maxi=Math.max(maxi,nums[i]);
            }
            r++;
            l++;
        }

        int ans=-1;

        for(int i=0;i<=maxi;i++){

            if(hash[i]==1){
                ans=Math.max(ans,i);
            }

        }

        return ans;
        
    }
}
