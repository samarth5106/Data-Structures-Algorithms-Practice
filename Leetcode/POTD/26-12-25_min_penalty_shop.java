class Solution{
    public int bestClosingTime(String customers){
        int opnp=0,closep=0;
        int penlty=0;
        int mini=Integer.MAX_VALUE;
        int hr=0;

        ArrayList<Integer> opn=new ArrayList<>();
        ArrayList<Integer> close=new ArrayList<>();

        close.add(0);
for(int i=0;i<customers.length();i++){
    if(customers.charAt(i)=='N'){
        closep++;
    }
    close.add(closep);
}


        for(int i=customers.length()-1;i>=0;i--){
            if(customers.charAt(i)=='Y'){
                opnp++;
            }
            opn.add(opnp);
        }

        Collections.reverse(opn);

        for(int i=0;i<customers.length();i++){
            penlty=opn.get(i)+close.get(i);
            if(mini>penlty){
                mini=penlty;
                hr=i;
            }
        }

        if(close.get(close.size()-1)<mini){
            hr=customers.length();
        }

        return hr;
    }
}
