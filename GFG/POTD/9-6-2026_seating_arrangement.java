class Solution {
    public boolean canSeatAllPeople(int k, int[] seats) {
        for(int i=0;i<seats.length-1;i++){
            if(seats[i]==1&&seats[i+1]==1){
                return false;
            }
        }
        if(k<=0) return true;
        if(seats.length<k) return false;
        if(seats.length==1){
            return seats[0]==0&&k<=1;
        }
        for(int i=0;i<seats.length;i++){
            if(i==0){
                if(seats[i]==0&&seats[i+1]!=1){
                    seats[i]=1;
                    k--;
                }
            }
            else if(i==seats.length-1){
                if(seats[i]==0&&seats[i-1]!=1){
                    seats[i]=1;
                    k--;
                }
            }
            else{
                if(seats[i]==0&&seats[i-1]==0&&seats[i+1]==0){
                    seats[i]=1;
                    k--;
                }
            }
            if(k<=0) return true;
        }
        return k<=0;
    }
}
