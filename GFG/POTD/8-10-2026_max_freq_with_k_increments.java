class Solution {
    public int maxFrequency(int[] arr, int k) {
        // code here
        //can only target bigger element
        //
        //sorting
        //hashmap freq
        //
        HashMap<Integer,Integer> done=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            done.put(arr[i],0);
        }
        
        Arrays.sort(arr);
        int cnt=0;
        int maxi=0;
        for(int i=arr.length-1;i>=0;i--){
            int val=arr[i];
            if(done.get(val)==1) continue;
            cnt=1;
            
            int life=k;
            for(int j=i-1;j>=0;j--){
                
                if(life-(val-arr[j])>=0) {
                    life-=val-arr[j];
                    cnt++;
                }
                else break;
               
            }
            done.put(val,1);
            maxi=Math.max(maxi,cnt);
            
        }
        return maxi;
    }
}
