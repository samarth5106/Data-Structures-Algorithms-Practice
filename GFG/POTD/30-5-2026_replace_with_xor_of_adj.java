class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int prev=arr[0];
        for(int i=0;i<arr.length;i++){
            if(i==0){
                prev=arr[0];
                arr[0]=arr[0]^arr[i+1];
            }
            else if(i==arr.length-1){
                arr[i]=prev^arr[i];
                
            }
            else{
                int temp=arr[i];
                arr[i]=prev^arr[i+1];
                prev=temp;
            }
        }
        
    }
}
