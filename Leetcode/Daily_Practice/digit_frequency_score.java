class Solution {
    public int digitFrequencyScore(int n) {
        String s=Integer.toString(n);
        int[] freq=new int[10];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'0']++;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            sum+=i*freq[i];
        }
        return sum;
    }
}©leetcode
