class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        //a=97
        //z=122
            String ans="";
        for(int i=0;i<words.length;i++){
            String current=words[i];
            int sum=0;
            int wtidx=0;
            for(int j=0;j<current.length();j++){
                wtidx=current.charAt(j)-97;
                sum+=weights[wtidx];
                
            }
            sum=sum%26;
            char c=(char)(122-sum);
            ans+=c;
            
        }
        return ans;
        
    }
}©leetcode
