class BusBooking {
    int n;
    //data str.
    int total=0;
    int mat[][];
    int cost[][];
    int bookedcount=0;
    //A=0, B=1, C=2, D=3
    //A1= A0
    //INITIALLY ALL FREE SO ALL VALUES=0;

    int time=0;
    
    public BusBooking(int rows) {
        n=rows;
        mat=new int[rows+1][4];
        cost=new int[rows+1][4];
    }
    
    public void toggle(String seat) {
        //0 free
        //1booked
        int col=0;
        int row=0;
        String sub=seat.substring(1);
        row=Integer.parseInt(sub)-1;
        char c=seat.charAt(0);
        if(c=='A') col=0;
        else if(c=='B') col=1;
        else if(c=='C') col=2;
        else col=3;
        
        if(mat[row][col]==0){
           int seatcost=1;
            if(col==0&&mat[row][1]==1){
                seatcost=3;
            }
            if(col==3&&mat[row][2]==1){
                seatcost=3;
            }
            
            mat[row][col]=1;
            cost[row][col]=seatcost;
            time+=seatcost;
            bookedcount++;
        } 
        else{
            mat[row][col]=0;
            time-=cost[row][col];
            cost[row][col]=0;
            bookedcount--;
        } 

        
    }
    
    public int getTotalTime() {
        return time;
    }
    
    public int getMinTime() {
        return bookedcount;
    }
}

/**
 * Your BusBooking object will be instantiated and called as such:
 * BusBooking obj = new BusBooking(n);
 * obj.toggle(seat);
 * int param_2 = obj.getTotalTime();
 * int param_3 = obj.getMinTime();
 */©leetcode
