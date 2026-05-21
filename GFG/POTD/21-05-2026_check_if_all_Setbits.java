class Solution {
    public boolean isBitSet(int n) {
        // code here
        String b=Integer.toBinaryString(n);
        for(int i=0;i<b.length();i++) {
            if(b.charAt(i)=='0') return false;
            
        }
            
            return true;
    }
    
};
