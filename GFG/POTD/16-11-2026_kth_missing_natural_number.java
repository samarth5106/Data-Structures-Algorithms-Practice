class Solution {
    public int findKthSmall(int[] arr, int k) {
        // code here
       // 1 2 3 4 5 6 7 8 9 10 11 12 
        Arrays.sort(arr);
        int ans=k;
        int cnt=0;
        int i=0;
        while(i<arr.length&&arr[i]<=ans){
            cnt++;
            ans++;
            i++;
            
        }
        
        return ans;
        
        
    }
}
