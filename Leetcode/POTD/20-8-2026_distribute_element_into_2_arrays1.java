class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        

        int[] arr1=new int[n];

        int arr2[]=new int[n];
        int ptr1=0;
        int ptr2=0;
        arr1[ptr1]=nums[0];
        ptr1++;
        arr2[ptr2]=nums[1];
        ptr2++;

        for(int i=2;i<nums.length;i++){
            int el=nums[i];
            
            if(arr2[ptr2-1]<arr1[ptr1-1]){
                arr1[ptr1]=el;
                ptr1++;
            }
            else{
                arr2[ptr2]=el;
                ptr2++;
            }

        }
        int result[]=new int[n];
        // System.arraycopy(arr1,0,result,0,arr1.length);
        // System.arraycopy(arr2,0,result,arr1.length,arr2.length);
       int cnt=0;
        for(int i=0;i<n;i++){
            if(arr1[i]!=0){
                 result[i]=arr1[i];
                 cnt++;
            }
           
        }
        int ptr=cnt;
       
        for(int i=0;i<n;i++){
            if(arr2[i]!=0){
                result[ptr]=arr2[i];
                ptr++;
            } 
        }
        return result;


    }
}
