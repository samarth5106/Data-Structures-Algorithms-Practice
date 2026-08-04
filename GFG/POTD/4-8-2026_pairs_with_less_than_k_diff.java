import java.util.Arrays;

class Solution{
    public static int countPairs(int arr[],int k){
        if(arr.length==1) return 0;
        Arrays.sort(arr);
        int cnt=0;
        int i=0;
        int validx=1;
        while(i<arr.length){
            while(validx<arr.length&&arr[validx]-arr[i]<k){
                validx++;
            }
            cnt+=validx-i-1;
            i++;
            if(validx<=i){
                validx=i+1;
            }
        }
        return cnt;
    }
}
