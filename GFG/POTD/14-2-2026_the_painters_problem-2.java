class Solution {
    static boolean canpaint(int[] arr,int k, int mid){
        int painters=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>mid){
                painters++;
                sum=arr[i];
                if(painters>k)
                return false;
            }
                else sum+=arr[i];
            
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low=0,high=0;
        int i=0;
        while(i<arr.length){
            low=Math.max(arr[i],low);
            high+=arr[i];
            i++;
            }
             int mid=low;
            while(low<=high){
                 mid=low+(high-low)/2;
                //mid=mid/2;
                if(canpaint(arr,k,mid)){
                    high=mid-1;
                    
                }
                else{
                    low=mid+1;
                }
            }
            return low;
    }
}
