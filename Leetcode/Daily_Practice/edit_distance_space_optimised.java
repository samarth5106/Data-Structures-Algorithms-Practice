class Solution {
 

    public int minDistance(String word1, String word2) {
        //int[][] dp=new int[word1.length()+1][word2.length()+1];
         //for dp 1 based indexing
         //for strings 0 based
         int[] prev=new int[word2.length()+1];
         int[] curr=new int[word2.length()+1];
            for(int j=1;j<=word2.length();j++){
                prev[j]=j;
            }
         //   prev[0]=curr[0]=0;

            for(int i=1;i<=word1.length();i++){
                curr[0]=i;
                for(int j=1;j<=word2.length();j++){
                    if(word1.charAt(i-1)==word2.charAt(j-1)){
                        curr[j]=prev[j-1];
                    }
                    else{
                        curr[j]=1+Math.min(prev[j-1],Math.min(prev[j],curr[j-1]));
                    }
                }
                prev=curr.clone();
            }
        return prev[word2.length()];   
    }
}
