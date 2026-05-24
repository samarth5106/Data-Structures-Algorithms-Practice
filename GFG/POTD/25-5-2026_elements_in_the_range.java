class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        //Arrays.sort(arr);
        int val=start;
        int elmnts=end-start+1;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=start&&arr[i]<=end){ cnt++;
            }
            //if(val>end) break;
        }
        if(cnt>=elmnts) return true;
        return false;
        
    }
}
