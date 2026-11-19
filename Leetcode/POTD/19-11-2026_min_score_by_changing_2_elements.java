class Solution {
    public int minimizeSum(int[] arr) {
        //score= high score+low score
        // maxi - mini= high score
        //mini - 2nd mini= low score, if 2 elements same honge then it will be 0 


        Arrays.sort(arr);
        int val=arr[1];
       
        int case1=0;
        int case2=0;

        case1=arr[arr.length-1]-arr[2];

        case2=arr[arr.length-3]-arr[0];

        int case3=arr[arr.length-2]-arr[1];


        return Math.min(case1,Math.min(case2,case3));
    }
}
