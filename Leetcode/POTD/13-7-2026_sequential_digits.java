class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
      List<Integer> ans=new ArrayList<>();
        int test=1;
       // int i=1;
        int diff=1;
        int digit;
        boolean mila=false;
            int initial=0;

        for(digit=2;digit<=9&&test<=high;digit++){
            int i=1;
            diff=diff+(int)(Math.pow(10,digit-1));

            if(initial==0)
            test=+diff;
            else test=initial+diff;

            initial=test;
            int kitne=10-digit;

             while(test+1<low&&i<=kitne){
                test=test+diff;
                i++;
             }

             if(test+1>=low)  mila=true;

            while(mila==true&&test<=high&&i<=kitne){
                ans.add(test+1);
                test=test+diff;
                i++;
             }

        }

    return ans;
       
    }
}
