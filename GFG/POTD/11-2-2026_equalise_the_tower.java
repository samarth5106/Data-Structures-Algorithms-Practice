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

This is a classic Problem concept - "WEIGHTED MEDIAN" - if sab ka cost 
same hota to answer normal Median hota ,, but in this case hame 
Different cost given hai so Weighted Median ka concept lgega it means 1) 
heights ko sort karo 2) saath me cost ko bhi reorder karo 3) total cost 
nikalo 4) prefix cost add kro 5) jis point par prefix>=totalCost/2 ho 
jae ,,, wahi best target hai

so pair bana lo of (Hight, cost) and sort according to height,, total cost sum nikal lo and uska half stoe kar lo then prefix sum cost nikalo and the most that prefix >=totalsum ks half uss point pr jo height hai vahi optimal height hai 
