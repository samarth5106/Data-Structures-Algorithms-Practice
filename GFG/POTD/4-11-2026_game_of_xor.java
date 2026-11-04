class Solution {
    public int subarrayXor(int[] arr) {
        // code here
        //start and end element ->n times
        //other -
        
        int xor=0;
        // 0 0 =0
        // 10 =1
        // 0 1=1
        // 1 1 =0
    
        int n=arr.length;
        // if(n==1) return arr[0];
        // int first=arr[0];
        // int last=arr[n-1];
        // int even=(n&1);
        
        // if(even==1){
        //     xor=first;
        //     xor^=last;
        // }
       
        
        for(int i=0;i<n;i++){
            int el=arr[i];
            int num=(i+1)*(n-i);
            if((num&1)==1){
                xor^=el;
            }
            
            
        }
        return xor;
        
        
    }
}
