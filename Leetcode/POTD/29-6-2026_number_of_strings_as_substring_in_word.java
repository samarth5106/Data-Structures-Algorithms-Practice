class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for(int i=0;i<patterns.length;i++){
            String s=patterns[i];
            int l=0;
            int r=s.length()-1;
            while(r<word.length()){
                String subs=word.substring(l,r+1);
                if(subs.equals(s)){
                    cnt++;break;
                }
                r++;
                l++;
            }
        }
        return cnt;
    }
}
