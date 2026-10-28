class Solution {
    public char nthCharacter(int n) {
        long len = 1;
        long count = 9;
        long start = 1;

        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        long targetNumber = start + (n - 1) / len;
        String s = Long.toString(targetNumber);
        
        return s.charAt((int) ((n - 1) % len));
    }
}
