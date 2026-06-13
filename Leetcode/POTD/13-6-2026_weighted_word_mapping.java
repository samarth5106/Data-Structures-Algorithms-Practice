class Solution {
    int getwt(String s,int[] weights){
        int wt=0;
        for(char c:s.toCharArray()){
            int ascii=c;
            //convert ascii to [1,26]
            wt+=weights[ascii-'a'];
        }
        return wt%26;
    }
    public String mapWordWeights(String[] words, int[] weights) {
        //finalChar=122-rem;
        String ans="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int wt=getwt(s,weights);
            ans+=(char)(122-wt);
            
        }
        return ans;
    }
}
