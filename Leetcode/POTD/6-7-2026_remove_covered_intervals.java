class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int cnt=0;
        int[] done=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            for(int j=0;j<intervals.length;j++){
                
                if(j!=i&&intervals[j][0]<=start&&intervals[j][1]>=end&&done[i]==0) {cnt++;
                done[i]=1;
                }
            }
        }
        return intervals.length-cnt;
        
    }
}
