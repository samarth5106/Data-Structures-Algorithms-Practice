class Solution {
    public char posInfinite(String s, int pos) {
        long len=s.length();
        long i=0;
        while(len<pos) {
            i++;
            len=2*len+i;
        }
        long p=pos;
        while(i>0) {
            long prevLen=(len-i)/2;
            if(p>prevLen+i) {
                p=len-p+1;
            } else if(p>prevLen) {
                return '$';
            }
            len=prevLen;
            i--;
        }
        return s.charAt((int)(p-1));
    }
}
