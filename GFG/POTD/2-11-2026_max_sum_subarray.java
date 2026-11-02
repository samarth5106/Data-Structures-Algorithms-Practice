class Solution {
    public int maximumSubarray(int[] arr) {
        // code here
        int normal=arr[0];
        int squared=arr[0]*arr[0];
        int ans=squared;
        if(normal<0) normal=0;
       // int maxinormal=normal;
        int maxisq=squared;
        
        for(int i=1;i<arr.length;i++){
            squared= squared+arr[i]; 
            squared=Math.max(arr[i]*arr[i],squared);
            squared=Math.max(squared,normal+(arr[i]*arr[i]));
            
            normal=Math.max(arr[i],normal+arr[i]);
         
            
            
            maxisq=Math.max(maxisq,squared);
            
            
            
            
        }
        return maxisq;
        
        
    }
}
