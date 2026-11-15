class Solution {
    public int numOfSubarrays(int[] arr) {
        //odd= odd+even 
        //odd = even +odd

        //if all even = then 0
        // sum of odd number of odds is odd
        // sum of even number of odds is even
        // all subarray sum if odd, store/ or increse count
        // n^2
        //prefx sum
       
       int odd=0;
       int even=1;
       int[] prfx=new int[arr.length];
       int s=0;

       for(int i=0;i<arr.length;i++){
            s+=arr[i];
            prfx[i]=s;
       }
        int ans=0;
        int mod=1000000007;
        for(int i=0;i<arr.length;i++){
            if(prfx[i]%2==0){
                even++;
                ans=(int)(((long)ans+odd)%mod);

            }    
            else{
                ans=(int)(((long)ans+even)%mod);
                odd++;
            } 
            
        }
        return ans;





    }
}
