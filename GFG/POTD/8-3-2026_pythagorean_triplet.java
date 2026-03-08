import java.util.Arrays;
class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        if(arr.length<3)
        return false;
        Arrays.sort(arr);
        
        for(int i=2;i<arr.length;i++){
            long c_sq=1L*arr[i]*arr[i];
            int a=0;
            int b=i-1;
            
            while(a<b){
                long current=1L*arr[a]*arr[a]+1L*arr[b]*arr[b];
                
                if(current==c_sq)
                return true;
                
                if(current<c_sq)
                a++;
                else
                b--;
            }
        }
        return false;
    }
}
