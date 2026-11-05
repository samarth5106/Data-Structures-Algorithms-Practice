
class Solution {
    
    public int getMinimumDays(String s, int[] p) {
        // code here
        int n=s.length();
       // string 1 based and p is 0 based
        
      // pair[] arr = new pair[s.length()];
       
       
       HashMap<Integer,Integer> mp=new HashMap<>();
       //str_index -> day
       for(int i=0;i<p.length;i++){
           
           int str_index=p[i];
           
           int day=i+1;
           
           mp.put(str_index,day);
           
       }

       int i=0;
       
       int maxi=0;
       
       StringBuilder sb=new StringBuilder(s);
       
       while(i<s.length()-1){
           
           if(sb.charAt(i)!='?'&&sb.charAt(i)==sb.charAt(i+1)){
               
               
               int cost1=mp.get(i);
              
               
               int cost2=mp.get(i+1);
               
               
                maxi=Math.max(maxi,Math.min(cost1,cost2));
                
                if(cost2>cost1){
                    
                   sb.setCharAt(i,'?');
                }
                
                else{
                 sb.setCharAt(i+1,'?');
               }
               
           }
           i++;
       }
       
       return maxi;
        
    }
}
