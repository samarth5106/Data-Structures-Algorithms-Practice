import java.util.*;

class Solution{
    public long minCost(int[] heights,int[] cost){
        int n=heights.length;
        long[][] pair=new long[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=heights[i];
            pair[i][1]=cost[i];
        }
        Arrays.sort(pair,(a,b)->Long.compare(a[0],b[0]));
        long total=0;
        for(int i=0;i<n;i++){
            total+=pair[i][1];
        }
        long half=(total+1)/2;
        long pref=0;
        long target=0;
        for(int i=0;i<n;i++){
            pref+=pair[i][1];
            if(pref>=half){
                target=pair[i][0];
                break;
            }
        }
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(heights[i]-target)*1L*cost[i];
        }
        return ans;
    }
}
