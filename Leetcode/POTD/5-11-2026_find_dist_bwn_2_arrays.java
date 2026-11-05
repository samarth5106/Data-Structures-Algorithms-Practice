class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        //distance value between the two arrays
        int cnt=0;
        
        for(int i=0;i<arr1.length;i++){
            int val=arr1[i];
            boolean status=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(val-arr2[j])<=d){
                    status=false;break;
                }
            }
            if(status) cnt++;
        }
        return cnt;
    }
}
