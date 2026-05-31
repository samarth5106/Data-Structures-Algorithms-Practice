import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        long mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            mini=Math.min(mini,(long)items[i][1]);
        }
        int maxFactor=0;
        for(int i=0;i<n;i++) {
            maxFactor=Math.max(maxFactor,items[i][0]);
        }
        long[] cnt=new long[maxFactor+1];
        for(int i=0;i<n;i++) {
            cnt[items[i][0]]++;
        }
        long[] mul=new long[maxFactor+1];
        for(int f=1;f<=maxFactor;f++) {
            for(int m=f;m<=maxFactor;m+=f) {
                mul[f]+=cnt[m];
            }
        }
        TreeMap<Integer,Long> mp=new TreeMap<>();
        for(int i=0;i<n;i++) {
            int fac=items[i][0];
            int price=items[i][1];
            long freeSlots=mul[fac]-1;
            if(freeSlots>0) {
                mp.put(price,mp.getOrDefault(price,0L)+freeSlots);
            }
        }
        long ans=0;
        for(Map.Entry<Integer,Long> entry : mp.entrySet()) {
            int price=entry.getKey();
            long freeAvailable=entry.getValue();
            if(budget<=0) break;
            if(price<2*mini) {
                long pk=Math.min(freeAvailable,(long)(budget/price));
                ans+=2*pk;
                budget-=pk*price;
            }
        }
        if(budget>0) {
            ans+=budget/mini;
        }
        return (int)ans;
    }
}
