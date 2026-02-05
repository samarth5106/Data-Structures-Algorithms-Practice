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


see approach is to maintain a window and uss window ke andr numbers of zeros count karo the moment number of zero becomes greater than k then l ko aage badhao and usme bhi condition lagao ki if arr[l]==0 hai then zero ke counter ko bhi minus 1 krenge and l++,,,, see jab zerocount<=k hai so window valid hai so we have stored the size best=max(best,r-l+1),, 
