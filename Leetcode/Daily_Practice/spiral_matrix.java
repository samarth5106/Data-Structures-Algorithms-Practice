import java.util.ArrayList;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;
        ArrayList<Integer> ans=new ArrayList<>();
        int size = matrix.length * matrix[0].length;

        while (bottom>=top&&right>=left){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
            
            }
            
            
        }
        return ans;
    }
}
