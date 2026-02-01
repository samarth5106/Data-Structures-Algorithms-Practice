import java.util.LinkedList;
import java.util.Queue;

class RideSharingSystem {
   Queue<Integer> rdr=new LinkedList<>();
   Queue<Integer> dvr=new LinkedList<>();
   int r=0;
   int d=0;
    public RideSharingSystem() {
        
    }
    
    public void addRider(int riderId) {
        int rider=riderId;
        rdr.add(rider);
        r++;
    }
    
    public void addDriver(int driverId) {
        int driver=driverId;
        dvr.add(driver);
        d++;
    }
    
    public int[] matchDriverWithRider() {
        int[] match=new int[2];
        if(rdr.isEmpty()==true||dvr.isEmpty()==true){
            match[0]=-1;
            match[1]=-1;
            return match;
        }
        match[0]=dvr.poll();
        match[1]=rdr.poll();
        //match[0]={rdr.poll(),dvr.poll()};
        return match;
        
    }
    
    public void cancelRider(int riderId) {
        rdr.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
