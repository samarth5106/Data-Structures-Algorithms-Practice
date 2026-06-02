import java.util.*;

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTotalTime=Integer.MAX_VALUE;

        for(int i=0;i<landStartTime.length;i++){
            int lStart=landStartTime[i];
            int lEnd=lStart+landDuration[i];
            
            for(int j=0;j<waterStartTime.length;j++){
                int wStart=waterStartTime[j];
                int wEnd=wStart+waterDuration[j];
                
                // Order 1: Land First, then Water
                int path1=Math.max(lEnd,wStart)+waterDuration[j];
                
                // Order 2: Water First, then Land
                int path2=Math.max(wEnd,lStart)+landDuration[i];
                
                int currentBest=Math.min(path1,path2);
                minTotalTime=Math.min(minTotalTime,currentBest);
            }
        }
        return minTotalTime;
    }
}
