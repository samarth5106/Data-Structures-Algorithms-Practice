class Solution {
    public int minInsertions(String s1) {
   
        String s2=new StringBuilder(s1).reverse().toString();
      
        int[] prev=new int[s1.length()+1];
        int[] curr=new int[s2.length()+1];


        for(int j=0;j<s2.length();j++){
            prev[j+1]=0;
        }

        for(int i=1;i<=s1.length();i++){
            curr[0]=0;
            for(int j=1;j<=s2.length();j++){
                 if(s1.charAt(i-1)==s2.charAt(j-1)){
           curr[j]= 1+prev[j-1];
        }

        else{
           curr[j]= 0+Math.max(prev[j],curr[j-1]);
        }
            }
            prev=curr.clone();
        }

       return s1.length()- prev[s2.length()];
    }
}
