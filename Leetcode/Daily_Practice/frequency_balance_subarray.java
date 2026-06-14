import java.util.*;

class Solution {
    public int getLength(int[] nums) {
        int ans=1;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> mp=new HashMap<>();
            HashMap<Integer,Integer> freqmp=new HashMap<>();
            for(int j=i;j<nums.length;j++){
                int old=mp.getOrDefault(nums[j],0);
                if(old>0){
                    freqmp.put(old,freqmp.get(old)-1);
                    if(freqmp.get(old)==0)freqmp.remove(old);
                }
                int now=old+1;
                mp.put(nums[j],now);
                freqmp.put(now,freqmp.getOrDefault(now,0)+1);
                if(mp.size()==1){
                    ans=Math.max(ans,j-i+1);
                }else if(freqmp.size()==2){
                    Iterator<Integer> it=freqmp.keySet().iterator();
                    int a=it.next();
                    int b=it.next();
                    int lo=Math.min(a,b);
                    int hi=Math.max(a,b);
                    if(hi==2*lo){
                        ans=Math.max(ans,j-i+1);
                    }
                }
            }
        }
        return ans;
    }
}
