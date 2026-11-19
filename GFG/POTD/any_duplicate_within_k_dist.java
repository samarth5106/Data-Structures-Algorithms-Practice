class Solution {
    public boolean checkWithinK(int[] arr, int k) {
        // code here
        int i=0;
        int j=k;
        
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        int l=i;
        while(l<=j){
            mp.put(arr[l],mp.getOrDefault(arr[l],0)+1);
            if(mp.get(arr[l])==2) return true;
            l++;
        }
        mp.put(arr[i],mp.get(arr[i])-1);
        i++;
        j++;
        while(j<arr.length){
             mp.put(arr[j],mp.getOrDefault(arr[j],0)+1);
             if(mp.get(arr[j])==2) return true;
              mp.put(arr[i],mp.get(arr[i])-1);
              i++;
              j++;
             
        }
        return false;
        
    }
}
