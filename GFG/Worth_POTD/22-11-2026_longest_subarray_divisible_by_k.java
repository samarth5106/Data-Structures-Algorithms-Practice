class Solution {
    public int longestSubarrayDivK(int[] arr, int k) {
        // code here
        int len=0;
        int n=arr.length;
        int[] pref=new int[n];
        int sum=0;
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum%k==0){
              len=Math.max(len,i+1);  
            }
            pref[i]=sum;
            int rem = (int)(sum % k);
            if (rem < 0) {
                rem += k;
            }
            if(!mp.containsKey(rem))
            mp.put(rem,i);
        }
        
        for(int r=0;r<n;r++){
            int val = (int)(pref[r] % k);
            if (val < 0) {
                val += k;
            }
            if(mp.containsKey(val)){
                len=Math.max(len,r-mp.get(val));
            }
            
        }
        
        return len;
        
    }
}
