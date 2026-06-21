class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int un=0;
        for(char c:moves.toCharArray()){
            if(c=='U') y++;
            else if(c=='D') y--;
            else if(c=='L') x--;
            else if(c=='R') x++;
            else un++;
        }
        return Math.abs(x)+Math.abs(y)+un;
    }
}
