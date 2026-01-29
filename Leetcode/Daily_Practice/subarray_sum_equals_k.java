import java.util.*;

class Solution {
    public int subarraySum(int[] arr,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);

        int sum=0;
        int cnt=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(mp.containsKey(sum-k)){
                cnt+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
GOT TLE ,, but i like the approach so pushed
