class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        long bulbs=(brightness+2)/3;
        if(bulbs<1) bulbs=1;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        long active=0;
        long l=intervals[0][0];
        long r=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=r+1){
                if(intervals[i][1]>r){
                    r=intervals[i][1];
                }
                
            }
            else{
                active+=r-l+1;
                l=intervals[i][0];
                r=intervals[i][1];
            }
        }
        active+=r-l+1;
        return active*bulbs;
    }
}©leetcode
