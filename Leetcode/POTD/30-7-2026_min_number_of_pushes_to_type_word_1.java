class Solution {
    public int minimumPushes(String word) {

        int cnt=0;
        int n=word.length();
        if(word.length()<=8) return n;
        if(word.length()<=16) return 8+((n-8)*2);
       if(n<=24) return 8+(16)+((n-16)*3);
        return 48 + (n - 24) * 4;

    }
}
