class Solution {
    int timetosec(String time){
        String[] parts=time.split(":");
        int hr=Integer.parseInt(parts[0]);
        int min=Integer.parseInt(parts[1]);
        int sec=Integer.parseInt(parts[2]);
        return hr*3600+min*60+sec;
        
    }
    public int secondsBetweenTimes(String startTime, String endTime) {
        return timetosec(endTime)-timetosec(startTime);
        
    }
}©leetcode
