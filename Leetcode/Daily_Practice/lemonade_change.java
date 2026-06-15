class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiv=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
            boolean done=false;
            if(bills[i]==20){
                int req=20-5;
                boolean TEN=false;
                if(ten>=1){
                    ten--;
                    TEN=true;
                }

                if(TEN){
                    if(fiv>=1){
fiv--;
                    done=true;
                    }
                    
                }
                else{
                    if(fiv>=3){
                        fiv-=3;
                        done=true;
                    }
                    
                }
            }
            else if(bills[i]==10){
                int req=1;
                if(fiv>=1){
                    done=true;
                    fiv--;

                }
                ten++;
            }
            else{
                fiv++;
                done=true;
            }
            if(!done) return false;
        }
        return true;
    }
}
