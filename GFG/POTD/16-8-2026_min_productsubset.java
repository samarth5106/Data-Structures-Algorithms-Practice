class Solution {
    public int minProd(int[] arr) {
        // code here
      //if all positive then sabse chota number
      //if neg hai then sbse choa neg multiplying with all positive 
      //odd  number of negativs chote vale
    //  boolean zr=false;
      int pos=0;
      int neg=0;
      int prdct=1;
      int minpos=11;
      int maxneg=-11;
      boolean zr=false;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==0)zr=true;
          if(arr[i]>0){
               pos++;
               minpos=Math.min(arr[i],minpos);
          }
          else if(arr[i]<0){
             neg++;
             maxneg=Math.max(maxneg,arr[i]);
          } 
          
          if(arr[i]!=0)
          prdct*=arr[i];
      }
    //  Arrays.sort(arr);
    
    //if all positive
    if(neg==0){
      if(zr==true) return 0;
      return minpos;
    } 
    
    //neg ka count bhi h and zero bhi then- answer neg prdct hi hoga as it is min 
    
      if((neg&1)==1){
         return prdct;
      }
      return prdct/maxneg;
      
    }
}
