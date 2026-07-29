class Solution {
    int minSubsets(int arr[]) {
        // code here
        if(arr.length==1) return 1;
        Arrays.sort(arr);
        int cnt=0;
      int isi=0;
      int fisi=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                cnt++;
                while(i<arr.length-1&&arr[i]+1==arr[i+1]) i++;
               
                
            }
            else{
                cnt++;
            } 
        }
      //  if(cnt=+=0) return arr.length;
      if(arr[arr.length-2]+1!=arr[arr.length-1]) cnt++;
        return cnt;
    }
}
