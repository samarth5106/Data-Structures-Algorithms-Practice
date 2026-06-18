class Solution {
    public double angleClock(int hour, int minutes) {
         //360 - bda = answer
        //min*6=angle
        // 1 min= 6deg
        //5 min= 30 deg
        //hr covers 30 deg in 60 min 
        // 1 deg in 2 min
        ////n min h to hr n/2 deg ghum lega 
        if(hour==12){
            hour=00;
        }

        double hr=(hour*30)+(minutes/2.0);//58.5
        double ans=Math.abs((minutes*6)-hr);//342

        return Math.min(ans,360-ans);
    }
}
