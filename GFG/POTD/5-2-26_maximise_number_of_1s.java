class Solution{
    public int maxOnes(int[] arr,int k){
        int l=0;
        int zero=0;
        int best=0;

        for(int r=0;r<arr.length;r++){
            if(arr[r]==0)zero++;

            while(zero>k){
                if(arr[l]==0)zero--;
                l++;
            }

            best=Math.max(best,r-l+1);
        }
        return best;
    }
}
