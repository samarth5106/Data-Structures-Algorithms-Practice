class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);
        int x=0;
        for(int i=0;i<queries.length;i++){
            if(queries[i][0]==0){
                al.add(queries[i][1]);
            }
            else{
               x=x^queries[i][1];
            }
        }
        int[] prfx=new int[al.size()];
       
       
       al.set(0,x);
       int k=0;
       for(int i=0;i<queries.length;i++){
           if(queries[i][0]==1){
               x=x^queries[i][1];
           }
           else{
               prfx[k]=x;
               k++;
           }
       }
        
        for(int i=1;i<al.size();i++){
            al.set(i,al.get(i)^prfx[i-1]);
        }
        Collections.sort(al);
        return al;
    }
}
