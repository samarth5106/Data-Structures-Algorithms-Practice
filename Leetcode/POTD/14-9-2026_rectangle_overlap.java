class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int r2x=rec2[0];
        int r2y=rec2[1];
        
        if(r2x<rec1[2]&&rec2[2]>rec1[0]){
            if(rec2[1]<rec1[3]&&rec2[3]>rec1[1]){
                return true;
            }
        }
        return false;
    }
}
