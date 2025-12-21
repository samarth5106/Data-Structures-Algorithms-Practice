// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int sum=0;
        int maxi=-1;
        int idx=0;
        int rsz=arr.length;
        int col=arr[0].length;
        for(int i=0;i<rsz;i++){
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
                
            }
         if(sum>maxi){
             maxi=sum;
             idx=i;
         }
         sum=0;
        }
        return idx;
    }
}
