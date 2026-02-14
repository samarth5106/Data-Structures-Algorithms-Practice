class Solution {
    public int prefixConnected(String[] words, int k) {
        int cnt=0;
        boolean[] used=new boolean[words.length];
        for(int i=0;i<words.length;i++){
            if(used[i])continue;
            String wrd="";
            String current=words[i];
            if(current.length()<k)
                continue;
            wrd=current.substring(0,k);
            int numgrp=1;
            for(int m=i+1;m<words.length;m++){
             
                if(words[m].length()<k)
                continue;
                String check=words[m].substring(0,k);
                if(check.equals(wrd)){
                    numgrp++;
                  used[m]=true;
                }
            }
            if(numgrp>=2)
                cnt++;
        }
        return cnt;
    }
}©leetcode
