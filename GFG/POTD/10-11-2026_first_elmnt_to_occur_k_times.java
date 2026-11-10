class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // code here
       // long[] freq;
        // long  maxi=0;
        
        // for(int v:arr){
            
        //     maxi=Math.max(v,maxi);
            
        // }
        // maxi++;
        // long[] freq=new long[maxi];
        HashMap<Integer,Integer> freq=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
            if(freq.get(arr[i])>=k) return arr[i];
        }
        return -1;
    }
}
